package com.aincorp.clotheswardrobe.services;

import com.aincorp.clotheswardrobe.entities.ClothesType;
import com.aincorp.clotheswardrobe.repositories.ClothesTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ClothesTypeService {

    @Autowired
    private ClothesTypeRepository clothesTypeRepository;

    public List<ClothesType> getAllClothesType() {
        return clothesTypeRepository.findAll();
    }

    public ClothesType save(ClothesType clothesType) {
        return clothesTypeRepository.save(clothesType);
    }

    public ClothesType getOne(Long id) {
        return clothesTypeRepository.getOne(id);
    }
}
