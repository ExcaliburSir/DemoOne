package com.wuly.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.wuly.ssm.entity.Merchant;

public interface MerchantDao {

	/**
	 * 根据登录名查询信息
	 * @param name 登录名
	 * @return
	 */
	Merchant queryById(String name);
	
	/**
	 * 更新用户姓名
	 * @param realname
	 * @param mid
	 * @return
	 */
	int updateRealNameByMid(@Param("realname") String realname, @Param("mid") Integer mid);
}
