package com.springBoot.demo;
//hello
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@GetMapping("/hello")
	public String Hello()
	{
		
		return "Hello World";
	}
}
