package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.Shoes;
import com.aincorp.clotheswardrobe.service.ShoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ShoesController {

    @Autowired
    private ShoesService shoesService;

    Map<String, String> errors;

    @GetMapping(value = "/allShoes")
    public List<Shoes> getAllShoes() {
        return shoesService.findAll();
    }

    @PostMapping(value = "/shoes")
    public ResponseEntity<Object> publishShoes(@RequestBody @Valid Shoes shoes, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
        }

        if (shoes.getId() != null) {
            Shoes s = shoesService.getOne(shoes.getId());

            if (s != null) {
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        }

        return new ResponseEntity<>(shoesService.save(shoes), HttpStatus.OK);
    }
}
