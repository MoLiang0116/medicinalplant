package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName disease
 */
@TableName(value ="disease")
@Data
public class Disease implements Serializable {
    /**
     * 病害ID
     */
    @TableId(type = IdType.AUTO)
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

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}