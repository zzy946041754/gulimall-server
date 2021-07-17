package com.zzy.gulimall.order.dao;

import com.zzy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zzy
 * @email zhangzongyuan1011@163.com
 * @date 2021-05-09 22:39:16
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
