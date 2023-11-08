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
    @TableId
    private Long plantid;

    /**
     * 学名
     */
    private String plantname;

    /**
     * 拉丁文名
     */
    private String latinname;

    /**
     * 别名
     */
    private String anothername;

    /**
     * 科属分类
     */
    private String familyclassification;

    /**
     * 照片url
     */
    private String pictureurl;

    /**
     * 药用部位
     */
    private String medicinalparts;

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
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 0 - 未删除	1 - 已删除
     */
    @TableLogic
    private Integer isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}