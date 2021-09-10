package com.xunqi.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源 锁定库存的vo
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-05 10:52
 **/

@Data
public class WareSkuLockVo {

    private String orderSn;

    /** 需要锁住的所有库存信息 **/
    private List<OrderItemVo> locks;



}
