package com.lmx.hitchhike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmx.hitchhike.entity.WebUser;
import com.lmx.hitchhike.service.WebUserService;
import com.lmx.hitchhike.mapper.WebUserMapper;
import org.springframework.stereotype.Service;

/**
* @author HP-01
* @description 针对表【web_user】的数据库操作Service实现
* @createDate 2022-03-15 12:00:03
*/
@Service
public class WebUserServiceImpl extends ServiceImpl<WebUserMapper, WebUser>
    implements WebUserService{

}




