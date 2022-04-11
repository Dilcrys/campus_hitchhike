package com.lmx.hitchhike.common.exception;

import com.lmx.hitchhike.common.utils.Result;
import com.lmx.hitchhike.common.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author lmx
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public Result<Void> handler(IllegalArgumentException e) {
        log.error("Assert异常：----------{}", e.getMessage());
        return ResultUtil.fail(e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public Result<Void> handler(RuntimeException e) {
        log.error("运行时异常：----------{}", e.getMessage());
        return ResultUtil.fail(e.getMessage());
    }

}
