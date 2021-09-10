package com.xunqi.gulimall.seckill.service;

import com.xunqi.gulimall.seckill.to.SeckillSkuRedisTo;

import java.util.List;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-09 19:29
 **/
public interface SeckillService {

    /**
     * 上架三天需要秒杀的商品
     */
    void uploadSeckillSkuLatest3Days();

    List<SeckillSkuRedisTo> getCurrentSeckillSkus();

    /**
     * 根据skuId查询商品是否参加秒杀活动
     * @param skuId
     * @return
     */
    SeckillSkuRedisTo getSkuSeckilInfo(Long skuId);

    /**
     * 当前商品进行秒杀（秒杀开始）
     * @param killId
     * @param key
     * @param num
     * @return
     */
    String kill(String killId, String key, Integer num) throws InterruptedException;
}
