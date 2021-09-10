package com.xunqi.common.to.mq;

import lombok.Data;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源 发送到mq消息队列的to
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-07-06 21:03
 **/

@Data
public class StockLockedTo {

    /** 库存工作单的id **/
    private Long id;

    /** 工作单详情的所有信息 **/
    private StockDetailTo detailTo;
}
