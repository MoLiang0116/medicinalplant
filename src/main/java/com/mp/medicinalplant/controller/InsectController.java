package com.mp.medicinalplant.controller;

import com.mp.medicinalplant.common.BaseResponse;
import com.mp.medicinalplant.entity.vo.InsectVO;
import com.mp.medicinalplant.entity.vo.PlantVO;
import com.mp.medicinalplant.service.InsectService;
import com.mp.medicinalplant.service.PlantService;
import com.mp.medicinalplant.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/insect")
public class InsectController {
    @Autowired
    InsectService insectService;

    @GetMapping("/queryList")
    public BaseResponse<List<InsectVO>> plantQueryList(String value){
        if (value==null){
            value = "";
        }
        List<InsectVO> insectVOList =  insectService.queryList(value);
        return ResultUtils.success(insectVOList);
    }
}

