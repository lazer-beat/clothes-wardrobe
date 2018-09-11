package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.ClothesType;
import com.aincorp.clotheswardrobe.repositories.ClothesTypeRepository;
import com.aincorp.clotheswardrobe.service.ClothesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ClothesTypeController {

    @Autowired
    private ClothesTypeService clothesTypeService;

    Map<String, String> errors;

    @GetMapping(value = "/allClothesType")
    public List<ClothesType> getAllClothes () {
        return clothesTypeService.getAllClothesType();
    }
}
