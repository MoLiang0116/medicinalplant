package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName review
 */
@TableName(value ="review")
@Data
public class Review implements Serializable {
    /**
     * 评论ID
     */
    @TableId
    private Long reviewid;

    /**
     * 评论人Id
     */
    private Long userid;

    /**
     * 评论类型	0 - 药用植物评论、 1 - 病害评论、2 - 虫害评论、3 - 农药评论
     */
    private Integer reviewtype;

    /**
     * 评论内容
     */
    private String reviewvalue;

    /**
     * 审核	0 - 未审核 1 - 审核通过 2 - 审核未通过
     */
    private Integer examine;

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