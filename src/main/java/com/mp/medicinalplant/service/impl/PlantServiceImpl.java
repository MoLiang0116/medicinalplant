package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.entity.pojo.Plant;
import com.mp.medicinalplant.service.PlantService;
import com.mp.medicinalplant.mapper.PlantMapper;
import org.springframework.stereotype.Service;

/**
* @author 86157
* @description 针对表【plant】的数据库操作Service实现
* @createDate 2023-11-08 16:25:18
*/
@Service
public class PlantServiceImpl extends ServiceImpl<PlantMapper, Plant>
    implements PlantService{

}




