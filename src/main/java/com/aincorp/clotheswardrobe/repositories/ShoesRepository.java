package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Long> {
}
