package com.xunqi.gulimall.order.feign;

import com.xunqi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-05 09:29
 **/

@FeignClient("gulimall-product")
public interface ProductFeignService {

    /**
     * 根据skuId查询spu的信息
     * @param skuId
     * @return
     */
    @GetMapping(value = "/product/spuinfo/skuId/{skuId}")
    public R getSpuInfoBySkuId(@PathVariable("skuId") Long skuId);

}
