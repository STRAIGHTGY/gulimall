package com.xunqi.gulimall.auth.vo;

import lombok.Data;

/**
 * @Description:  本源码分享自 www.cx1314.cn   欢迎访问获取更多资源 社交用户信息
 * @Created: 程序源码论坛
 * @author: cx
 * @createTime: 2020-06-28 11:04
 **/

@Data
public class SocialUser {

    private String access_token;

    private String remind_in;

    private long expires_in;

    private String uid;

    private String isRealName;

}
