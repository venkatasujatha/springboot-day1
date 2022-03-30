package com.springBoot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zRequParamController 
{
	@GetMapping("/chinnu/query")
	public Sujatha sujicom(@RequestParam(name="Name")String Name,@RequestParam(defaultValue="id")int id)
	{ 
		
		return new Sujatha(Name,id);
	}
	@GetMapping("/hh")
	public void suj()
	{
		System.out.println("sujatha");
	}
}
