package com.mp.medicinalplant.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mp.medicinalplant.entity.bo.PlantInsectBO;
import com.mp.medicinalplant.entity.pojo.PlantInsect;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 86157
* @description 针对表【PlantInsect】的数据库操作Mapper
* @createDate 2023-11-09 11:30:56
* @Entity com.mp.medicinalplant.entity.pojo.PlantInsect
*/
public interface PlantInsectMapper extends BaseMapper<PlantInsect> {
    List<PlantInsectBO> queryPlantInsectList(String value);
}




