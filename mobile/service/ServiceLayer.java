package com.laptop.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
	
	@Autowired
	private RestTemplate restTempalte;

	
	@Autowired
public ServiceLayer(RestTemplate restTempalte) {
	super();
		this.restTempalte = restTempalte;
	}

	
//public String cousumeAPI()
//{
//	return restTempalte.getForObject("'https://jsonplaceholder.typicode.com/todos/1'", String.class);
//}


public String consumeAPI() {
	
	String res= restTempalte.getForObject("https://jsonplaceholder.typicode.com/todos/1", String.class);

	System.out.println(res);
	return res;
}
}

	
	
	
	
	
	


