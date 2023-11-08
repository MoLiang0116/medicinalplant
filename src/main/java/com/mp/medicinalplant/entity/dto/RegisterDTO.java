package com.mp.medicinalplant.entity.dto;

import lombok.Data;

@Data
public class RegisterDTO {
    private String account;
    private String username;
    private String password;
    private String checkPassword;
}
