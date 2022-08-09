package com.laptop.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.mobile.service.ServiceLayer;

@RestController
public class HomeController {
	
	
	
	@Autowired
private  ServiceLayer serviceLayer;



//	public HomeController(ServiceLayer serviceLayer) {
//	super();
//	this.serviceLayer = serviceLayer;
//}

@GetMapping("/nama")
	public String getData()
	{
	return	 serviceLayer.consumeAPI();
	
}
	
	
	
	
	
}
