package com.example.examqraphql.mappers;

import com.example.examqraphql.dtos.UserDTO;
import com.example.examqraphql.entities.User;
import com.example.examqraphql.services.UserManager;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserMapper {

    private ModelMapper modelMapper;


    public User fromUserDTO(UserDTO userDTO){
        return modelMapper.map(userDTO, User.class);
    }

    public UserDTO fromUser(User user){
        return modelMapper.map(user, UserDTO.class);
    }
}
