package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
