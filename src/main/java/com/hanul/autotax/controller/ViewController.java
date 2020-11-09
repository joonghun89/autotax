package com.hanul.autotax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class ViewController {

	@RequestMapping(value="/main")
	String goMain() throws Exception{	
		return "main";		
	}	
}
