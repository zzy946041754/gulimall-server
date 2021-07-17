package com.zzy.gulimall.member.dao;

import com.zzy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zzy
 * @email zhangzongyuan1011@163.com
 * @date 2021-05-09 22:26:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
