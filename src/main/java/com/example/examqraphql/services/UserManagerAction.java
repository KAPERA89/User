package com.example.examqraphql.services;

import com.example.examqraphql.dtos.UserDTO;
import com.example.examqraphql.entities.User;
import com.example.examqraphql.mappers.UserMapper;
import com.example.examqraphql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerAction implements UserManager{

    @Autowired
    private UserRepository userrepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getuserByEmail(String email) {
        return userMapper.fromUser(userrepository.findByEmail(email));
    }

    @Override
    public UserDTO getUserByDateNaissance(String date) {
        return userMapper.fromUser(userrepository.findByDateNaissance(date));
    }

    @Override
    public UserDTO saveUser(User user) throws Exception {
        if(userrepository.existsByEmail(user.getEmail())){
            throw new Exception("User Already Exist");
        }

        User savedUser = userrepository.save(user);
        UserDTO userDTO = userMapper.fromUser(savedUser);
        return userDTO;
    }

    @Override
    public UserDTO deleteUser(Long id) {
        User user = userrepository.findById(id).get();
        userrepository.deleteById(id);
        return userMapper.fromUser(user);
    }
}
