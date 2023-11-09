package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName QuestionType
 */
@TableName(value ="QuestionType")
@Data
public class QuestionType implements Serializable {
    /**
     * 问题类型编号
     */
    @TableId(type = IdType.AUTO)
    private Long QuestionTypeId;

    /**
     * 问题类型名称
     */
    private String QuestionTypeName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除	0 - 未删除	1 - 已删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}