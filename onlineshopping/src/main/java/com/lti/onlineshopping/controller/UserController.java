package com.lti.onlineshopping.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.shoppingbackend.dto.User;
import com.lti.shoppingbackend.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;

		@Autowired
		//@Qualifier(value = "userService")
		public void setUserService(UserService ps) {
			this.userService = ps;
		}

		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String addUser(@ModelAttribute("user") @Valid User u, BindingResult result, User user) {
			this.userService.addUser(u);
				
				return "register";
			}
			
		@RequestMapping(value = "/register/add", method = RequestMethod.POST)
		public String addRegisterAdd(@ModelAttribute("user") @Valid User u, BindingResult result, User user) {
			this.userService.addUser(u);
				
				return "success";
			}
			


}
