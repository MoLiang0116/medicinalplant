package com.mp.medicinalplant.service;

import com.mp.medicinalplant.entity.pojo.Disease;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mp.medicinalplant.entity.vo.DiseaseVO;

import java.util.List;

/**
* @author 86157
* @description 针对表【disease】的数据库操作Service
* @createDate 2023-11-09 11:30:56
*/
public interface DiseaseService extends IService<Disease> {

    List<DiseaseVO> queryList(String value);
}
