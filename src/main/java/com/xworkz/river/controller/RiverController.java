package com.xworkz.river.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping()
public class RiverController {
	
	public RiverController() {
		System.out.println(this.getClass().getSimpleName()+"  armaan");
		
		
	}
	
	@RequestMapping("/gretting")
	@ResponseBody
	public  String gretting()
	{
		return "hello all";
	}

	}
