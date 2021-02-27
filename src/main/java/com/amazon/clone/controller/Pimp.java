package com.amazon.clone.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.clone.service.Service;



@RestController
public class Pimp {

	Service service=new Service();
	
	@RequestMapping(value="/girls" , method=RequestMethod.GET ,headers = "Accept=application/json")
	public  List ListGirls() {
	List chicksAvailable=service.getALLgirls();
		return chicksAvailable;
	}
}
