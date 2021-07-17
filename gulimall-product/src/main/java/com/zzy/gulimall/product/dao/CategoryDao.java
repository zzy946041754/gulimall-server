package com.zzy.gulimall.product.dao;

import com.zzy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zzy
 * @email zhangzongyuan1011@163.com
 * @date 2021-05-09 15:23:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
