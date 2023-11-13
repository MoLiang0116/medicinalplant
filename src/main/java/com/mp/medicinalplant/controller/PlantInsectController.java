package com.mp.medicinalplant.controller;

import com.mp.medicinalplant.common.BaseResponse;
import com.mp.medicinalplant.entity.bo.PlantInsectBO;
import com.mp.medicinalplant.entity.vo.InsectVO;
import com.mp.medicinalplant.mapper.PlantInsectMapper;
import com.mp.medicinalplant.service.PlantInsectService;
import com.mp.medicinalplant.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plantinsect")
public class PlantInsectController {
    @Autowired
    PlantInsectService plantInsectService;


    @GetMapping("/queryList")
    public BaseResponse<List<PlantInsectBO>> plantQueryList(String value){
        if (value==null){
            value = "";
        }
        List<PlantInsectBO> plantInsectBOList =  plantInsectService.queryList(value);
        return ResultUtils.success(plantInsectBOList);
    }
}
