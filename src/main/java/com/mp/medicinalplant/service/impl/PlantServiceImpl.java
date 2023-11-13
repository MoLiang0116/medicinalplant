package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.entity.pojo.Plant;
import com.mp.medicinalplant.entity.vo.PlantVO;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.PlantService;
import com.mp.medicinalplant.mapper.PlantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 86157
* @description 针对表【plant】的数据库操作Service实现
* @createDate 2023-11-09 11:30:56
*/
@Service
public class PlantServiceImpl extends ServiceImpl<PlantMapper, Plant>
    implements PlantService{
    @Autowired
    PlantMapper plantMapper;
    @Override
    public List<PlantVO> queryList(String value) {
        if (value == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<Plant> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("plantName",value)
                .or()
                .like("latinName",value)
                .or()
                .like("anotherName",value);
        List<Plant> plantList = plantMapper.selectList(queryWrapper);
        if (plantList==null){
            throw new BusinessException(ErrorCode.Query_FAILED);
        }
        List<PlantVO> plantVOList = new ArrayList<>();
        plantList.forEach(plant -> {
            plantVOList.add(new PlantVO(plant.getPlantId(),plant.getPlantName(),plant.getLatinName(),plant.getAnotherName(),plant.getFamilyClassification(),plant.getPictureUrl(),plant.getMedicinalParts(),plant.getProducer(),plant.getDescription(),plant.getCreateTime(),plant.getUpdateTime()));
        });
        return plantVOList;
    }
}




