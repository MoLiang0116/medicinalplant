package com.mp.medicinalplant.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class InsectVO {
    public InsectVO(Integer insectId, String insectName, String latinName, String anthorNames, String familyClassification, String distribution, String description, String pictureUrl, Date createTime, Date updateTime) {
        this.insectId = insectId;
        this.insectName = insectName;
        this.latinName = latinName;
        this.anthorNames = anthorNames;
        this.familyClassification = familyClassification;
        this.distribution = distribution;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

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
}
