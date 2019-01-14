package com.lti.onlineshopping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.shoppingbackend.dao.CategoryDAO;
import com.lti.shoppingbackend.dto.Category;
import com.lti.shoppingbackend.dto.User;

@Controller
public class PageController {

	@Autowired
private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/page1","/index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page1");
		mv.addObject("title","Home");
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	
 	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("title","Login");
		mv.addObject("userClickLogin",true);
		return mv;
	}
	
	/*@RequestMapping(value="/")
	public ModelAndView adduser() {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("title","Add User");
		mv.addObject("userClickLogin",true);
		return mv;
	}*/
	/*@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@Valid @ModelAttribute("user") User user,BindingResult bindingResult,Model model,HttpServletRequest req) {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("title","Register");
		mv.addObject("userClickRegister",true);
		return mv;
	}*/
	@RequestMapping(value="/about")
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("about");
		mv.addObject("title","About us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value="/seller_login")
	public ModelAndView seller() {
		ModelAndView mv=new ModelAndView("seller_login");
		mv.addObject("title","Sell");
		mv.addObject("userClickSell",true);
		return mv;
	}
	
	
	@RequestMapping(value="/Television")
	public ModelAndView Television() {
		ModelAndView mv=new ModelAndView("Products");
		mv.addObject("title","Category TV");
		mv.addObject("userClickTelevision",true);
		return mv;
	}
	// method to load products based on categories
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllPoducts() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//pass list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value="/show/{id}/products")
	public ModelAndView showCategoryPoducts(@PathVariable("id") int id) {
		ModelAndView mv=new ModelAndView("page");
		
		//categorydao to fetch a single category
		Category category=null;
		category=categoryDAO.get(id);
		mv.addObject("title","All Products");
		
		//pass list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
}
