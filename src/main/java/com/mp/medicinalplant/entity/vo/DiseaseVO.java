package com.mp.medicinalplant.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class DiseaseVO {
    public DiseaseVO(Long diseaseId, String plantName, String diseaseName, String latinName, String diseaseSite, String diseaseState, String description, String diseaseCause, String occurrenceRule, String controlMethod, String damagePictureUrl, Date createTime, Date updateTime) {
        this.diseaseId = diseaseId;
        this.plantName = plantName;
        this.diseaseName = diseaseName;
        this.latinName = latinName;
        this.diseaseSite = diseaseSite;
        this.diseaseState = diseaseState;
        this.description = description;
        this.diseaseCause = diseaseCause;
        this.occurrenceRule = occurrenceRule;
        this.controlMethod = controlMethod;
        this.damagePictureUrl = damagePictureUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    private Long diseaseId;

    /**
     * 病害植物学名
     */
    private String plantName;

    /**
     * 病害名称
     */
    private String diseaseName;

    /**
     * 拉丁名
     */
    private String latinName;

    /**
     * 病害部位
     */
    private String diseaseSite;

    /**
     * 病害状
     */
    private String diseaseState;

    /**
     * 分布与危害
     */
    private String description;

    /**
     * 病因
     */
    private String diseaseCause;

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
