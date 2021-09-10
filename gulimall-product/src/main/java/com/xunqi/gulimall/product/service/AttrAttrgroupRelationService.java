package com.xunqi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xunqi.common.utils.PageUtils;
import com.xunqi.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.xunqi.gulimall.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author cx
 * @more   www.cx1314.cn
 * @date 2020-05-22 19:00:18
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void saveBatch(List<AttrGroupRelationVo> vos);
}
