package com.lmx.hitchhike.controller;

import com.lmx.hitchhike.common.utils.Result;
import com.lmx.hitchhike.common.utils.ResultUtil;
import com.lmx.hitchhike.entity.CommonRoute;
import com.lmx.hitchhike.service.CommonRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lmx
 */
@RestController
public class RouteController {

    @Autowired
    private CommonRouteService commonRouteService;

    @GetMapping("/route/getRoute")
    public Result<List<CommonRoute>> getRoute() {
        List<CommonRoute> routes = commonRouteService.list();
        return ResultUtil.success(routes);
    }

    @PostMapping("/route/addRoute")
    public Result<CommonRoute> addRoute(@RequestBody CommonRoute commonRoute) {
        boolean result = commonRouteService.save(commonRoute);
        if (result) {
            return ResultUtil.success(commonRoute);
        }else {
            return ResultUtil.fail();
        }
    }

    @PostMapping("/route/updateRoute")
    public Result<CommonRoute> updateRoute(@RequestBody CommonRoute commonRoute) {
        boolean result = commonRouteService.updateById(commonRoute);
        if (result) {
            return ResultUtil.success(commonRoute);
        }else {
            return ResultUtil.fail();
        }
    }

    @GetMapping("/route/delete")
    public Result<Long> deleteRoute(@RequestParam("id") Long routeId) {
        boolean result = commonRouteService.removeById(routeId);
        if (result) {
            return ResultUtil.success(routeId);
        }else {
            return ResultUtil.fail();
        }
    }

}
