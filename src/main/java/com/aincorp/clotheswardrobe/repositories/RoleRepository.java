package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
