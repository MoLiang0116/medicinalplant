package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.entity.pojo.User;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.UserService;
import com.mp.medicinalplant.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.mp.medicinalplant.constant.UserConstant.SALT;

/**
* @author 86157
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-11-08 16:25:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean userRegister(String userAccount, String username, String userPassword, String checkPassword) {
        // 1. 校验
        if (StringUtils.isAnyBlank(userAccount,username, userPassword, checkPassword )) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "参数为空");
        }
        if (userAccount.length() < 4) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "用户账号过短");
        }
        if (userPassword.length() < 8 || checkPassword.length() < 8) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "用户密码过短");
        }
        // 账户不能包含特殊字符
        String validPattern = "[`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher accountMatcher = Pattern.compile(validPattern).matcher(userAccount);
        if (accountMatcher.find()) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"账号包含特殊字符");
        }
        Matcher usernameMatcher = Pattern.compile(validPattern).matcher(username);
        if (usernameMatcher.find()) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"用户名包含特殊字符");
        }
        // 密码和校验密码相同
        if (!userPassword.equals(checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"密码与校验密码不同");
        }
        // 账户不能重复
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        long count = userMapper.selectCount(queryWrapper);
        if (count > 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "账号重复");
        }
        // 2. 加密
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
        // 3. 插入数据
        User user = new User();
        user.setAccount(userAccount);
        user.setPassword(encryptPassword);
        user.setUsername(username);
        boolean saveResult = this.save(user);
        if (!saveResult) {
            throw new BusinessException(ErrorCode.REGISTER_FAILED);
        }
        return true;
    }




}




