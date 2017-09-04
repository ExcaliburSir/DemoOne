package com.wuly.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuly.ssm.entity.Phone;

public interface PhoneDao {
	
	/**
	 * 查询用户所有手机号
	 * @param mid
	 * @return
	 */
	List<Phone> queryByMid(Integer mid);

	/**
	 * 删除一个手机号
	 * @param mid
	 * @param phone
	 * @return
	 */
	int deletePhoneByPhone(@Param("mid") Integer mid, @Param("phone") Integer phone);
}
