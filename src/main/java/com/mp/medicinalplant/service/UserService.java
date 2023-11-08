package com.mp.medicinalplant.service;

import com.mp.medicinalplant.entity.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 86157
* @description 针对表【user】的数据库操作Service
* @createDate 2023-11-08 16:25:18
*/
public interface UserService extends IService<User> {

    Boolean userRegister(String userAccount, String username, String userPassword, String checkPassword);
}
