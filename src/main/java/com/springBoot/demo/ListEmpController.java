package com.springBoot.demo;
//list
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ListEmpController 
{	@GetMapping("/hi")
	public List<Sujatha> getSujatha()
	{
		List<Sujatha> i=new ArrayList<Sujatha>();
		i.add(new Sujatha("Rani",2));
		i.add(new Sujatha("Raju",3));
		i.add(new Sujatha("chinni",4));
		i.add(new Sujatha("Krishna",5));
		return i;
	}
}
