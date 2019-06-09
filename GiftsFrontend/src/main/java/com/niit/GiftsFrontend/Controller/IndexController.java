package com.niit.GiftsFrontend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	
	@RequestMapping("/product")
	public String product()
	{
		return "product";
	}
	 
//	@RequestMapping("/cart")
//	public String cart()
//	{
//		return "cart";
//	}
	
//	@RequestMapping("/checkout")
//	public String checkout()
//	{
//		return "checkout";
//	}
	
//	@RequestMapping("/category")
//	public String category()
//	{
//		return "category";
//	}
//	
//	@RequestMapping("/product1")
//	public String product1()
//	{
//		return "product1";
//	}
	
//	@RequestMapping("/supplier")
//	public String supplier()
//	{
//		return "supplier";
//	}
	
//	@RequestMapping("/users")
//	public String users()
//	{
//		return "users";
//	}
	
//	@RequestMapping("/login")
//	public String login()
//	{
//		return "login";
//	}
	
//	@RequestMapping("/signup")
//	public String signup()
//	{
//	return "signup";
//	}
}
