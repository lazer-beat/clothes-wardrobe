package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
