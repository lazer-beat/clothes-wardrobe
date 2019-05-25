package com.aincorp.clotheswardrobe.repositories;

import com.aincorp.clotheswardrobe.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
