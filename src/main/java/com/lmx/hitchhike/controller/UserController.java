package com.lmx.hitchhike.controller;

import com.lmx.hitchhike.common.utils.Result;
import com.lmx.hitchhike.common.utils.ResultUtil;
import com.lmx.hitchhike.entity.Passenger;
import com.lmx.hitchhike.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lmx
 */
@RestController
public class UserController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/user/getAllUser")
    public Result<List<Passenger>> getAllUser() {
        List<Passenger> passengers = passengerService.list();
        return ResultUtil.success(passengers);
    }
}
