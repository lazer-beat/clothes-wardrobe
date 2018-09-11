package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.ClothesType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClothesTypeRepository extends JpaRepository<ClothesType, Long> {

}
