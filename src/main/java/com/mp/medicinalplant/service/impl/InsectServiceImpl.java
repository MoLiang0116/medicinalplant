package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.entity.pojo.Insect;
import com.mp.medicinalplant.entity.pojo.Plant;
import com.mp.medicinalplant.entity.vo.InsectVO;
import com.mp.medicinalplant.entity.vo.PlantVO;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.InsectService;
import com.mp.medicinalplant.mapper.InsectMapper;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 86157
* @description 针对表【insect】的数据库操作Service实现
* @createDate 2023-11-09 11:30:56
*/
@Service
public class InsectServiceImpl extends ServiceImpl<InsectMapper, Insect>
    implements InsectService{
    @Autowired
    InsectMapper insectMapper;

    @Override
    public List<InsectVO> queryList(String value) {
        if (value == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<Insect> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("insectName",value)
                .or()
                .like("latinName",value)
                .or()
                .like("anthorNames",value);
        List<Insect> insectList = insectMapper.selectList(queryWrapper);
        if (insectList==null){
            throw new BusinessException(ErrorCode.Query_FAILED);
        }
        List<InsectVO> insectVOList = new ArrayList<>();
        insectList.forEach(insect -> {
            insectVOList.add(new InsectVO(insect.getInsectId(),insect.getInsectName(),insect.getLatinName(),insect.getAnthorNames(),insect.getFamilyClassification(),insect.getDistribution(),insect.getDescription(),insect.getPictureUrl(),insect.getCreateTime(),insect.getUpdateTime()));
        });
        return insectVOList;
    }
}




