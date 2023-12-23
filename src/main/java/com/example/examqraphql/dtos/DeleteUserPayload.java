package com.example.examqraphql.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeleteUserPayload {
    private String deleted;
    private UserDTO userDTO;
}
