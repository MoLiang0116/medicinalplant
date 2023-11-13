package com.mp.medicinalplant.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class PlantVO {
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

    public PlantVO(Long plantId, String plantName, String latinName, String anotherName, String familyClassification, String pictureUrl, String medicinalParts, String producer, String description, Date createTime, Date updateTime) {
        this.plantId = plantId;
        this.plantName = plantName;
        this.latinName = latinName;
        this.anotherName = anotherName;
        this.familyClassification = familyClassification;
        this.pictureUrl = pictureUrl;
        this.medicinalParts = medicinalParts;
        this.producer = producer;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
