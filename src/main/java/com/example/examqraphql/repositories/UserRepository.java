package com.example.examqraphql.repositories;

import com.example.examqraphql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
    User findByDateNaissance(String dateNaissance);
    Boolean existsByEmail(String email);
}
