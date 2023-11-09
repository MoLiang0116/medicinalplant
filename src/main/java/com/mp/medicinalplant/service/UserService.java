package com.mp.medicinalplant.service;

import com.mp.medicinalplant.entity.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author 86157
* @description 针对表【user】的数据库操作Service
* @createDate 2023-11-09 11:30:56
*/
public interface UserService extends IService<User> {

    Boolean userRegister(String userAccount, String username, String userPassword, String checkPassword);

    User userLogin(String account, String password, HttpServletRequest request);

    User getSafetyUser(User originUser);
}
