package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.CustomerMasterBean;
import com.demo.service.DemoService;

@RestController
public class HomeController {
	
	@Autowired
	private Environment environment;
	
	@Value("${jdbc}")
	private String jdbcurl;
	
	@Autowired
	@Qualifier("Ashish")
	private DemoService demoService;

	
	@GetMapping("/home")
	public CustomerMasterBean getData(@RequestParam String name,String password) {
		System.out.println(jdbcurl);
	   return demoService.getData(name);
	}

}
