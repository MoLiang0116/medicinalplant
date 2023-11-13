package com.mp.medicinalplant.service;

import com.mp.medicinalplant.entity.bo.PlantInsectBO;
import com.mp.medicinalplant.entity.pojo.PlantInsect;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 86157
* @description 针对表【PlantInsect】的数据库操作Service
* @createDate 2023-11-09 11:30:56
*/
public interface PlantInsectService extends IService<PlantInsect> {

    List<PlantInsectBO> queryList(String value);
}
