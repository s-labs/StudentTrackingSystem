package com.controllers.school;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SchoolAdminController {

	@RequestMapping(value="",method = RequestMethod.GET)
	public ModelAndView schoolAdminHomePage(){
		
		return new ModelAndView();
	}
	
}
