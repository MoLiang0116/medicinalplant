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
    @TableId
    private Long diseaseid;

    /**
     * 病害植物学名
     */
    private String plantname;

    /**
     * 病害名称
     */
    private String diseasename;

    /**
     * 拉丁名
     */
    private String latinname;

    /**
     * 病害部位
     */
    private String diseasesite;

    /**
     * 病害状
     */
    private String diseasestate;

    /**
     * 分布与危害
     */
    private String description;

    /**
     * 病因
     */
    private String diseasecause;

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