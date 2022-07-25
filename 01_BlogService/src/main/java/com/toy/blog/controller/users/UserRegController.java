package com.toy.blog.controller.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.toy.blog.service.users.UserRegService;

@Controller
public class UserRegController {
	@Autowired UserRegService userRegService; 
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView inPage() {
		logger.info("[로거] 회원가입 Controller");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userRegPage");
		
		mav.addObject("msg", userRegService.inPage());
		
		return mav;
	}
}
