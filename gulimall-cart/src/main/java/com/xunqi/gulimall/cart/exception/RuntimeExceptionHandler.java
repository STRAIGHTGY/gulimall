package com.xunqi.gulimall.cart.exception;

import com.xunqi.common.utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源 统一异常处理
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-11 21:09
 **/

@ControllerAdvice
public class RuntimeExceptionHandler {

    /**
     * 全局统一异常处理
     * @param exception
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public R handler(RuntimeException exception) {
        return R.error(exception.getMessage());
    }


    @ExceptionHandler(CartExceptionHandler.class)
    public R userHandler(CartExceptionHandler exception) {
        return R.error("购物车无此商品");
    }
}
