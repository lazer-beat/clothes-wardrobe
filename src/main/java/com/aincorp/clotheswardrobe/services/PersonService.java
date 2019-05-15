package com.aincorp.clotheswardrobe.services;

import com.aincorp.clotheswardrobe.entities.Person;
import com.aincorp.clotheswardrobe.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
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

    public Person updatePerson(Person person) {
        return personRepository.saveAndFlush(person);
    }
}
