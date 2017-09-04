package com.wuly.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuly.ssm.dao.PhoneDao;
import com.wuly.ssm.entity.Phone;
import com.wuly.ssm.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService{
	
	@Autowired
	private PhoneDao phoneDao;
	
	public List<Phone> queryByMid(Integer mid){
		return phoneDao.queryByMid(mid);
	}
	
	public void deletePhoneByPhone(Integer mid, Integer phone){
		phoneDao.deletePhoneByPhone(mid, phone);
	}
}
