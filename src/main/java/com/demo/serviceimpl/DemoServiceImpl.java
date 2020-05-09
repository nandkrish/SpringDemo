package com.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.demo.bean.CustomerMasterBean;
import com.demo.service.DemoService;

@Service("Ashish")
public class DemoServiceImpl implements DemoService {
	

	@Override
	public CustomerMasterBean getData(String name) {
		
		CustomerMasterBean customerMasterBean =new CustomerMasterBean() ;
		customerMasterBean.setName("kk");
		customerMasterBean.setPwd("kk");
	
		return customerMasterBean;
	}

}
