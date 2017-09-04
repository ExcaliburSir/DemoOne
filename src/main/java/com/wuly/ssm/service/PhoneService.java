package com.wuly.ssm.service;

import java.util.List;

import com.wuly.ssm.entity.Phone;

public interface PhoneService {

	/**
	 * 查询用户所有手机号
	 */
	public List<Phone> queryByMid(Integer mid);
	
	/**
	 * 删除一个手机号
	 */
	public void deletePhoneByPhone(Integer mid, Integer phone);
}
