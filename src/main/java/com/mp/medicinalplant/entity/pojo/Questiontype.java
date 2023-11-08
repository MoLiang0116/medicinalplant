package com.mp.medicinalplant.entity.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName questiontype
 */
@TableName(value ="questiontype")
@Data
public class Questiontype implements Serializable {
    /**
     * 问题类型编号
     */
    @TableId
    private Long questiontypeid;

    /**
     * 问题类型名称
     */
    private String questiontypename;

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