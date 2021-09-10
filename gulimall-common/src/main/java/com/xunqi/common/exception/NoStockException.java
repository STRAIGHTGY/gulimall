package com.xunqi.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源 无库存抛出的异常
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-05 11:39
 **/

public class NoStockException extends RuntimeException {

    @Getter @Setter
    private Long skuId;

    public NoStockException(Long skuId) {
        super("商品id："+ skuId + "库存不足！");
    }

    public NoStockException(String msg) {
        super(msg);
    }


}
