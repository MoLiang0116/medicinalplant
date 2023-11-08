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
    @TableId
    private Integer insectid;

    /**
     * 虫害名
     */
    private String insectname;

    /**
     * 拉丁名
     */
    private String latinname;

    /**
     * 别名
     */
    private String anthornames;

    /**
     * 科属分类
     */
    private String familyclassification;

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
    private String pictureurl;

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