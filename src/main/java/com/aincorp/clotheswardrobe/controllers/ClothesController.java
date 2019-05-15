package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.Clothes;
import com.aincorp.clotheswardrobe.services.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ClothesController {

    @Autowired
    private ClothesService clothesService;

    Map<String, String> errors;

    @GetMapping(value = "/allClothes")
    public List<Clothes> getAllClothes() {
        return clothesService.getAllClothes();
    }

    @PostMapping(value = "/clothes")
    public ResponseEntity<Object> publishClothes(@RequestBody @Valid Clothes clothes, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
        }

        if (clothes.getId() != null) {
            Clothes c = clothesService.getOne(clothes.getId());

            if (c != null) {
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        }

        if (clothes.getCreatedDate() == null) {
            clothes.setCreatedDate(new Date());
        }

        return new ResponseEntity<>(clothesService.save(clothes), HttpStatus.OK);
    }

}
