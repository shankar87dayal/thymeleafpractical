package com.practice.controller;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("inside about the handler....");
		
		//putting data in model
		model.addAttribute("name","Raushan Ranjan");
		model.addAttribute("currebtDate",new Date().toLocaleString());
		
		//example
//		String nameString ="raushan";
//		nameString.toUpperCase();
		
		return "about";
		
		//about.html
	}
	
	//handling iteraation
	@GetMapping("/example_loop")
	public String iterateHandler(Model model)
	{
		
		//create a list , set collection 
		List<String> names  = List.of("ravi","ramu","shyam", "rahul","mahesh");
		model.addAttribute("names", names);
		return "iterate";
	}
	
	
	
	//handler for conditional statement
	@GetMapping("/condition")
	public String conditionHamdler(Model m)
	{
		System.out.println("conditional handler executed....");
		m.addAttribute("isActive",true);
		m.addAttribute("Gender","F");
		
		List<String> list  = List.of("ram","ravi","ramu","shyam", "rahul","mahesh");
		m.addAttribute("mylist",list);
		
		return "condition";
	}
	
	//handler for including fragmentes
	@GetMapping("/service")
	public String serviceHandler(Model m)
	{
		m.addAttribute("title", "I like thymeleaf topic");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		
		
		return "service";
	}
	
	//for new about 
	@GetMapping("/newabout")
	public String newAbout()
	{
		return "aboutnew";
	}
	
	//for new contact 
		@GetMapping("/contact")
		public String contact()
		{
			return "contact";
		}
}
