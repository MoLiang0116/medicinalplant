package com.mp.medicinalplant.entity.bo;

import lombok.Data;

import java.util.Date;

@Data
public class PlantInsectBO {
    private Long plantId;

    /**
     * 学名
     */
    private String plantName;

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
}
