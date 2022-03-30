package com.springBoot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//path variable annotation

@RestController
public class PathVarController 
{	
	@GetMapping("/hii/{Name}/{id}")
	public Sujatha chinnu(@PathVariable("Name")	String Name,@PathVariable("id")int id)
	{
		
		return new Sujatha(Name,id);
		
	}
}
