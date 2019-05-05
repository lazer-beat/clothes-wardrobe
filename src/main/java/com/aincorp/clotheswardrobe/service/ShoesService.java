package com.aincorp.clotheswardrobe.service;

import com.aincorp.clotheswardrobe.entities.Shoes;
import com.aincorp.clotheswardrobe.repositories.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoesService {

    @Autowired
    ShoesRepository shoesRepository;

    public List<Shoes> findAll() {
        return shoesRepository.findAll();
    }

    public Shoes getOne(Long id) {
        return shoesRepository.getOne(id);
    }

    public Shoes save(Shoes shoes) {
        return shoesRepository.save(shoes);
    }
}
