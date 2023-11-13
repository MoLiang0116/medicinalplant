package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName PlantInsect
 */
@TableName(value ="PlantInsect")
@Data
public class PlantInsect implements Serializable {
    /**
     * 植物ID
     */
    @TableId
    private Long plantId;

    /**
     * 虫害ID
     */
    @TableId
    private Long insectId;

    /**
     * 危害部位
     */
    private String damagePart;

    /**
     * 危害症状
     */
    private String damageSymptom;

    /**
     * 危害特点
     */
    private String damagePeculiarity;

    /**
     * 发生规律
     */
    private String occurrenceRule;

    /**
     * 防治方法
     */
    private String controlMethod;

    /**
     * 被害照片
     */
    private String damagePictureUrl;

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