package com.beingjavaguys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView getHome() {
		String string = "Congrats ! You are done with your first Spring Security configuration !";
		return new ModelAndView("home", "string", string);
	}

	@RequestMapping("/")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}

}

