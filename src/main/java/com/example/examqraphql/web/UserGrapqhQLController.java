package com.example.examqraphql.web;

import com.example.examqraphql.dtos.UserDTO;
import com.example.examqraphql.entities.User;
import com.example.examqraphql.services.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserGrapqhQLController {

    @Autowired
    public UserManager userManager;


    @MutationMapping
    public UserDTO saveUser(@Argument User user) throws Exception {
        return userManager.saveUser(user);
    }

    @MutationMapping
    public UserDTO deleteUser(@Argument Long id){
        return userManager.deleteUser(id);
    }

    @QueryMapping
    public UserDTO getuserByEmail(@Argument String email){
        return userManager.getuserByEmail(email);
    }

    @QueryMapping
    public UserDTO getUserByDateNaissance(@Argument String date){
        return userManager.getUserByDateNaissance(date);
    }

}
