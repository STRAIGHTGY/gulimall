package com.xunqi.gulimall.order.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-05 09:30
 **/

@Data
public class SpuInfoVo {

    /**
     * 商品id
     */
    private Long id;
    /**
     * 商品名称
     */
    private String spuName;
    /**
     * 商品描述
     */
    private String spuDescription;
    /**
     * 所属分类id
     */
    private Long catalogId;
    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名
     */
    private String brandName;

    /**
     *
     */
    private BigDecimal weight;
    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    private Integer publishStatus;
    /**
     *
     */
    private Date createTime;
    /**
     *
     */
    private Date updateTime;

}
