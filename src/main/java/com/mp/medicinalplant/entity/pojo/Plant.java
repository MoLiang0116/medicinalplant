package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName plant
 */
@TableName(value ="plant")
@Data
public class Plant implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long plantId;

    /**
     * 学名
     */
    private String plantName;

    /**
     * 拉丁文名
     */
    private String latinName;

    /**
     * 别名
     */
    private String anotherName;

    /**
     * 科属分类
     */
    private String familyClassification;

    /**
     * 照片url
     */
    private String pictureUrl;

    /**
     * 药用部位
     */
    private String medicinalParts;

    /**
     * 产地分布
     */
    private String producer;

    /**
     * 描述
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
     * 0 - 未删除	1 - 已删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}