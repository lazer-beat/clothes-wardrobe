package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {

    void deleteClothesById(Long id);
}
