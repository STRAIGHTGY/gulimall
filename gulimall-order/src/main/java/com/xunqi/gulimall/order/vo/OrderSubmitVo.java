package com.xunqi.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源 封装订单提交数据的vo
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-04 11:54
 **/

@Data
public class OrderSubmitVo {

    /** 收获地址的id **/
    private Long addrId;

    /** 支付方式 **/
    private Integer payType;
    //无需提交要购买的商品，去购物车再获取一遍
    //优惠、发票

    /** 防重令牌 **/
    private String orderToken;

    /** 应付价格 **/
    private BigDecimal payPrice;

    /** 订单备注 **/
    private String remarks;

    //用户相关的信息，直接去session中取出即可
}
