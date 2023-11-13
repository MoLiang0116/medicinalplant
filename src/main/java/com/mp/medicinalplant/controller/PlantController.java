package com.mp.medicinalplant.controller;

import com.mp.medicinalplant.common.BaseResponse;
import com.mp.medicinalplant.common.ErrorCode;
import com.mp.medicinalplant.exception.BusinessException;
import com.mp.medicinalplant.service.PlantService;
import com.mp.medicinalplant.service.UserService;
import com.mp.medicinalplant.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plant")
public class PlantController {
    @Autowired
    PlantService plantService;

    @GetMapping("/queryList")
    public BaseResponse plantQueryList(String value){
        if (value==null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        List plantlist =  plantService.queryList(value);
        return ResultUtils.success(plantlist);
    }
}
