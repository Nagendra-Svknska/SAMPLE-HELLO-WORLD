package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home_controller 
{
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("lets find out");
		return "home.jsp";
	}
}
