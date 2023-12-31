package com.mp.medicinalplant.service;

import com.mp.medicinalplant.entity.pojo.Insect;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mp.medicinalplant.entity.vo.InsectVO;

import java.util.List;

/**
* @author 86157
* @description 针对表【insect】的数据库操作Service
* @createDate 2023-11-09 11:30:56
*/
public interface InsectService extends IService<Insect> {

    List<InsectVO> queryList(String value);
}
