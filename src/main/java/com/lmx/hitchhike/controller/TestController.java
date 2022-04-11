package com.lmx.hitchhike.controller;

import com.lmx.hitchhike.entity.Passenger;
import com.lmx.hitchhike.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lmx
 */
@RestController
@RequestMapping("hitchhike")
public class TestController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("t1")
    public String test() {
        return "test ok";
    }

    @GetMapping("/user")
    public Passenger getById() {
        return passengerService.getById(1L);
    }

}
