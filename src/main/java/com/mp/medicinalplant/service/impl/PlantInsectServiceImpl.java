package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.entity.bo.PlantInsectBO;
import com.mp.medicinalplant.entity.pojo.Insect;
import com.mp.medicinalplant.entity.pojo.PlantInsect;
import com.mp.medicinalplant.entity.vo.InsectVO;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.PlantInsectService;
import com.mp.medicinalplant.mapper.PlantInsectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 86157
* @description 针对表【PlantInsect】的数据库操作Service实现
* @createDate 2023-11-09 11:30:56
*/
@Service
public class PlantInsectServiceImpl extends ServiceImpl<PlantInsectMapper, PlantInsect>
    implements PlantInsectService{
    @Autowired
    PlantInsectMapper plantInsectMapper;
    @Override
    public List<PlantInsectBO> queryList(String value) {
        if (value == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List<PlantInsectBO> plantInsectBOList = plantInsectMapper.queryPlantInsectList(value);
        if (plantInsectBOList==null){
            throw new BusinessException(ErrorCode.Query_FAILED);
        }
        return plantInsectBOList;
    }
}




