package com.aincorp.clotheswardrobe.service;

import com.aincorp.clotheswardrobe.entities.Person;
import com.aincorp.clotheswardrobe.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person getOne(Long id) {
        return personRepository.getOne(id);
    }
}
