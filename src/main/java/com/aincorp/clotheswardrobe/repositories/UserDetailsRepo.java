package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
