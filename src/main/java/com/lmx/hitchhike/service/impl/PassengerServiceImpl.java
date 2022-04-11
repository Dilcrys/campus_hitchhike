package com.lmx.hitchhike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmx.hitchhike.entity.Passenger;
import com.lmx.hitchhike.service.PassengerService;
import com.lmx.hitchhike.mapper.PassengerMapper;
import org.springframework.stereotype.Service;

/**
* @author HP-01
* @description 针对表【passenger】的数据库操作Service实现
* @createDate 2022-03-15 12:00:03
*/
@Service
public class PassengerServiceImpl extends ServiceImpl<PassengerMapper, Passenger>
    implements PassengerService{

}




