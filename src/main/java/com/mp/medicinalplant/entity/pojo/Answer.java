package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName answer
 */
@TableName(value ="answer")
@Data
public class Answer implements Serializable {
    /**
     * 回答Id
     */
    @TableId
    private Long answerid;

    /**
     * 回答内容
     */
    private String answervalue;

    /**
     * 回答者Id
     */
    private Long userid;

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