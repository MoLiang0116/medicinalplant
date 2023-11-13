package com.mp.medicinalplant.controller;

import com.mp.medicinalplant.common.BaseResponse;
import com.mp.medicinalplant.entity.vo.DiseaseVO;
import com.mp.medicinalplant.service.DiseaseService;
import com.mp.medicinalplant.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disease")
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;

    @GetMapping("/queryList")
    public BaseResponse<List<DiseaseVO>> plantQueryList(String value){
        if (value==null){
            value = "";
        }
        List<DiseaseVO> diseaseVOList =  diseaseService.queryList(value);
        return ResultUtils.success(diseaseVOList);
    }
}
