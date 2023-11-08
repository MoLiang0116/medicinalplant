package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户Id
     */
    @TableId
    private Long userid;

    /**
     * 账号
     */
    private String account;

    /**
     * 名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 0 - 被封禁	1 - 普通用户2 - 专家用户	3 - 管理员
     */
    private Integer role;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 0 - 未删除	1 - 已删除
     */
    @TableLogic
    private Integer isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}