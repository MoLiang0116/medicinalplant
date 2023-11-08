package com.mp.medicinalplant.constant;


public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";

    //  ------- 权限 --------

    /**
     * 默认权限
     */
    int DEFAULT_ROLE = 0;


    /**
     * 专家权限
     */
    int EXPERT_ROLE = 1;
    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 2;

    String SALT = "moliang";

}
