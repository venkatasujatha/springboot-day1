package com.springBoot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{	@GetMapping("/Sujatha")
	public Sujatha getSujatha()
	{
		return new Sujatha("sunny",1);
		
	}
	

}
