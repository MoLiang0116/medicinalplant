package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName insect
 */
@TableName(value ="insect")
@Data
public class Insect implements Serializable {
    /**
     * 虫害ID
     */
    @TableId(type = IdType.AUTO)
    private Integer insectId;

    /**
     * 虫害名
     */
    private String insectName;

    /**
     * 拉丁名
     */
    private String latinName;

    /**
     * 别名
     */
    private String anthorNames;

    /**
     * 科属分类
     */
    private String familyClassification;

    /**
     * 分布区域
     */
    private String distribution;

    /**
     * 形态描述
     */
    private String description;

    /**
     * 形态照片
     */
    private String pictureUrl;

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