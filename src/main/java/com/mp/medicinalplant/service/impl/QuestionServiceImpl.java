package com.mp.medicinalplant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.medicinalplant.entity.pojo.Question;
import com.mp.medicinalplant.service.QuestionService;
import com.mp.medicinalplant.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 86157
* @description 针对表【question】的数据库操作Service实现
* @createDate 2023-11-08 16:25:18
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




