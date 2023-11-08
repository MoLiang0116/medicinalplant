package com.mp.medicinalplant.controller;

import com.mp.medicinalplant.common.BaseResponse;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.entity.dto.RegisterDTO;
import com.mp.medicinalplant.entity.pojo.User;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.UserService;
import com.mp.medicinalplant.util.ResultUtils;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public BaseResponse<Boolean> userRegister(@RequestBody RegisterDTO registerDTO){
        if (registerDTO==null){
            throw new BusinessException(ErrorCode.NULL_ERROR);
        }
        String userAccount = registerDTO.getAccount();
        String username = registerDTO.getUsername();
        String userPassword = registerDTO.getPassword();
        String checkPassword = registerDTO.getCheckPassword();
        if (StringUtils.isAnyBlank(userAccount,username,userPassword,checkPassword)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return ResultUtils.success(userService.userRegister(userAccount,username,userPassword,checkPassword));
    }

//    @GetMapping("/login")
//    public BaseResponse<User> userlogin(String account,String password){
//
//    }
}
