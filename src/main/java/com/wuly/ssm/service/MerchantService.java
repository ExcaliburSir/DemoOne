package com.wuly.ssm.service;

import com.wuly.ssm.entity.Merchant;


public interface MerchantService {
	/**
	 * 根据登录名查询信息
	 */
	public Merchant queryById(String name);
	
	/**
	 * 更新用户姓名
	 */
	public void updateRealNameByMid(String realname, Integer mid);
}