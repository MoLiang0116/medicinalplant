package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.entity.pojo.Disease;
import com.mp.medicinalplant.entity.pojo.Plant;
import com.mp.medicinalplant.entity.vo.DiseaseVO;
import com.mp.medicinalplant.entity.vo.PlantVO;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.DiseaseService;
import com.mp.medicinalplant.mapper.DiseaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 86157
* @description 针对表【disease】的数据库操作Service实现
* @createDate 2023-11-09 11:30:56
*/
@Service
public class DiseaseServiceImpl extends ServiceImpl<DiseaseMapper, Disease>
    implements DiseaseService{
    @Autowired
    DiseaseMapper diseaseMapper;
    @Override
    public List<DiseaseVO> queryList(String value) {
        if (value == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<Disease> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("diseaseName",value)
                .or()
                .like("latinName",value);
        List<Disease> diseaseList = diseaseMapper.selectList(queryWrapper);
        if (diseaseList==null){
            throw new BusinessException(ErrorCode.Query_FAILED);
        }
        List<DiseaseVO> diseaseVOList = new ArrayList<>();
        diseaseList.forEach(disease -> {
            diseaseVOList.add(new DiseaseVO(disease.getDiseaseId(),disease.getPlantName(),disease.getDiseaseName(),disease.getLatinName(),disease.getDiseaseSite(),disease.getDiseaseState(),disease.getDescription(),disease.getDiseaseCause(),disease.getOccurrenceRule(),disease.getControlMethod(),disease.getDamagePictureUrl(),disease.getCreateTime(),disease.getUpdateTime()));});
        return diseaseVOList;
    }
}




