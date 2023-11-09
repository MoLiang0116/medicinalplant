package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName pesticide
 */
@TableName(value ="pesticide")
@Data
public class Pesticide implements Serializable {
    /**
     * 登记证号
     */
    @TableId
    private String registrationCertificate;

    /**
     * 农药名称
     */
    private String pesticideName;

    /**
     * 登记作物
     */
    private String plantNames;

    /**
     * 农药类型
     */
    private String pesticideType;

    /**
     * 防治对象
     */
    private String target;

    /**
     * 信息描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}