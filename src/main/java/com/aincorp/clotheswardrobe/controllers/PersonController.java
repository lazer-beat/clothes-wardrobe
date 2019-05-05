package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.Person;
import com.aincorp.clotheswardrobe.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    Map<String, String> errors;

    @GetMapping(value = "/allPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
