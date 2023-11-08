package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName plantinsect
 */
@TableName(value ="plantinsect")
@Data
public class Plantinsect implements Serializable {
    /**
     * 植物ID
     */
    @TableId
    private Long plantid;

    /**
     * 虫害ID
     */
    @TableId
    private Long insectid;

    /**
     * 危害部位
     */
    private String damagepart;

    /**
     * 危害症状
     */
    private String damagesymptom;

    /**
     * 危害特点
     */
    private String damagepeculiarity;

    /**
     * 发生规律
     */
    private String occurrencerule;

    /**
     * 防治方法
     */
    private String controlmethod;

    /**
     * 被害照片
     */
    private String damagepictureurl;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间

     */
    private Date updatetime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}