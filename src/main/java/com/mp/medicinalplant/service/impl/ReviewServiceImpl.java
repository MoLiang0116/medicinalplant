package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.entity.pojo.Review;
import com.mp.medicinalplant.service.ReviewService;
import com.mp.medicinalplant.mapper.ReviewMapper;
import org.springframework.stereotype.Service;

/**
* @author 86157
* @description 针对表【review】的数据库操作Service实现
* @createDate 2023-11-09 11:30:56
*/
@Service
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review>
    implements ReviewService{

}




