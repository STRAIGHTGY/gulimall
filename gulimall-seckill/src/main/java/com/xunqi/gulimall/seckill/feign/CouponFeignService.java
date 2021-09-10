package com.xunqi.gulimall.seckill.feign;

import com.xunqi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-09 19:33
 **/

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 查询最近三天需要参加秒杀商品的信息
     * @return
     */
    @GetMapping(value = "/coupon/seckillsession/Lates3DaySession")
    R getLates3DaySession();

}
