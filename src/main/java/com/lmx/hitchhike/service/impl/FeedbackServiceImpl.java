package com.lmx.hitchhike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmx.hitchhike.entity.Feedback;
import com.lmx.hitchhike.service.FeedbackService;
import com.lmx.hitchhike.mapper.FeedbackMapper;
import org.springframework.stereotype.Service;

/**
* @author HP-01
* @description 针对表【feedback】的数据库操作Service实现
* @createDate 2022-03-15 12:00:03
*/
@Service
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback>
    implements FeedbackService{

}




