package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.Person;
import com.aincorp.clotheswardrobe.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    Map<String, String> errors;

    //Map<String, Person> personRepo = new HashMap<>();

    @GetMapping(value = "/allPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping(value = "/persons/{id}")
    public MappingJacksonValue getPersonById(@PathVariable("id") Long id) {

        MappingJacksonValue wrapper = new MappingJacksonValue(personService.getOne(id));

        return wrapper;
    }

    /*@GetMapping(value = "users/{id}")
    public MappingJacksonValue getUser(@PathVariable("id") Long id,
                                       @RequestParam(value = "fields") String fields) {

        MappingJacksonValue wrapper = new MappingJacksonValue(userRepository.findOne(id));

        wrapper.setFilters(new SimpleFilterProvider()
                .addFilter("userFilter",
                        SimpleBeanPropertyFilter.filterOutAllExcept(fields.split(","))));
        return wrapper;
    }*/

    @PostMapping(value = "/persons")
    public ResponseEntity<Object> publishPersons(@RequestBody @Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
        }

        if (person.getId() != null) {
            Person p = personService.getOne(person.getId());

            if (p.getId() != null) {
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        }

        return new ResponseEntity<>(personService.save(person), HttpStatus.OK);
    }

    /*@RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Person person) {
        //personRepo.put(id, person);
        personService.updatePerson(personService.getOne(Long.valueOf(id)));
        return new ResponseEntity<>("Person is updated", HttpStatus.OK);
    }*/
}
