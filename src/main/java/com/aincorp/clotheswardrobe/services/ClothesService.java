package com.aincorp.clotheswardrobe.services;

import com.aincorp.clotheswardrobe.entities.Clothes;
import com.aincorp.clotheswardrobe.repositories.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClothesService {

    @Autowired
    private ClothesRepository clothesRepository;

    public List<Clothes> getAllClothes() {
        return clothesRepository.findAll();
    }

    public Clothes save(Clothes clothes) {
        return clothesRepository.save(clothes);
    }

    public Clothes getOne(Long id) {
        return clothesRepository.getOne(id);
    }

    public void deleteClothes(Long id) {
        clothesRepository.deleteClothesById(id);
    }
}
