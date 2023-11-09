package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.entity.pojo.Disease;
import com.mp.medicinalplant.service.DiseaseService;
import com.mp.medicinalplant.mapper.DiseaseMapper;
import org.springframework.stereotype.Service;

/**
* @author 86157
* @description 针对表【disease】的数据库操作Service实现
* @createDate 2023-11-09 11:30:56
*/
@Service
public class DiseaseServiceImpl extends ServiceImpl<DiseaseMapper, Disease>
    implements DiseaseService{

}




