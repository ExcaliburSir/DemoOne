package com.wuly.ssm.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wuly.ssm.entity.Merchant;
import com.wuly.ssm.entity.Phone;
import com.wuly.ssm.service.MerchantService;
import com.wuly.ssm.service.PhoneService;

@Controller
@RequestMapping("/merchant")
public class MerchantController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MerchantService merchantService;
	@Autowired
	private PhoneService phoneService;
	
	@RequestMapping(value = "/phone/{name}", method = RequestMethod.GET)
	private String getPhone(@PathVariable("name") String name, Model model) {
		Merchant merchant = merchantService.queryById(name);
		List<Phone> phones = phoneService.queryByMid(merchant.getMid());
		 
		model.addAttribute("merchant", merchant);
		model.addAttribute("phones", phones);
		
		return "merchant";
	}
	
}
