package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
