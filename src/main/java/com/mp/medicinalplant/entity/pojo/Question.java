package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * 问题Id
     */
    @TableId
    private Long questionid;

    /**
     * 问题标题
     */
    private String questiontitle;

    /**
     * 问题内容
     */
    private String questionvalue;

    /**
     * 问题分类
     */
    private String questiontype;

    /**
     * 提问者Id
     */
    private Long userid;

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
     * 是否删除	0 - 未删除	1 - 已删除
     */
    @TableLogic
    private Integer isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}