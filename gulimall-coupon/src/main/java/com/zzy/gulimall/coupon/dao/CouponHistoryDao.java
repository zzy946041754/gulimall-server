package com.zzy.gulimall.coupon.dao;

import com.zzy.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zzy
 * @email zhangzongyuan1011@163.com
 * @date 2021-05-09 22:06:19
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
