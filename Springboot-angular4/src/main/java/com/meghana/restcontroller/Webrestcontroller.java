package com.meghana.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webrestcontroller {
	@RequestMapping("/api/hi")
	public String hi(){
		return("hi this is meghana");
	}
	
	
	

}
