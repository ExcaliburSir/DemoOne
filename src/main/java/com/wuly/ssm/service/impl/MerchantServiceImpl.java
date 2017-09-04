package com.wuly.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuly.ssm.dao.MerchantDao;
import com.wuly.ssm.entity.Merchant;
import com.wuly.ssm.service.MerchantService;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantDao merchantDao;
	
	
	public Merchant queryById(String name){
		return merchantDao.queryById(name);
	}
	
	public void updateRealNameByMid(String realname, Integer mid){
		merchantDao.updateRealNameByMid(realname, mid);
	}
}
