package com.example.examqraphql.services;

import com.example.examqraphql.dtos.UserDTO;
import com.example.examqraphql.entities.User;

public interface UserManager {
    UserDTO getuserByEmail(String email);
    UserDTO getUserByDateNaissance(String date);
    UserDTO saveUser(User user) throws Exception;
    UserDTO deleteUser(Long id);

}
