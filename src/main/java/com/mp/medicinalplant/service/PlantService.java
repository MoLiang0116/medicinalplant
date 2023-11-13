package com.mp.medicinalplant.service;

import com.mp.medicinalplant.entity.pojo.Plant;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mp.medicinalplant.entity.vo.PlantVO;

import java.util.List;

/**
* @author 86157
* @description 针对表【plant】的数据库操作Service
* @createDate 2023-11-09 11:30:56
*/
public interface PlantService extends IService<Plant> {

    List<PlantVO> queryList(String value);

}
