package com.mef.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/user/client")
public class HolaResource {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	@RequestMapping ("/{id}")
	
	public String hola(@PathVariable("id") String id) {
		//String url ="http://avelasquezpractica02-server-Carlos/rest/hola/server";
		System.out.println("miSaludo: " + id);
		String url ="http://ABASTARRACHEA-SERVER/rest/user/server/" + id;
		//return restTemplate.getForObject(url,String.class);
		return restTemplate.getForObject(url,String.class);
	}
	

}
