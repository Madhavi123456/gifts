package com.niit.GiftsFrontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GiftsBackend.Dao.BillingDao;
import com.niit.GiftsBackend.Dao.UsersDao;
import com.niit.GiftsBackend.Model.Authentication;
import com.niit.GiftsBackend.Model.Billing;
import com.niit.GiftsBackend.Model.Cart;
import com.niit.GiftsBackend.Model.Users ;

@Controller
public class UsersController {
	@Autowired
	Users users;
	@Autowired
	UsersDao usersDao;
	
	
	@RequestMapping("/users")
	public ModelAndView Users()
	{
		System.out.println("1234");
		ModelAndView mv = new ModelAndView("users");
		List<Users> userslist = usersDao.userslist();
		mv.addObject("users", new Users());
		mv.addObject("Users",userslist);
		return mv;
	}
	
	@RequestMapping(value="/addUsers",method=RequestMethod.POST)
	public ModelAndView addUsers(@ModelAttribute("users") Users users,Model model)
	{
		
		ModelAndView mv = new ModelAndView();
		Authentication a=new Authentication();
		a.setUserName(users.getEmailId());
		Cart c=new Cart();
//		Billing b=new Billing();
//		users.setBilling(b);
		users.setAuthentication(a);
		users.setCart(c);
		
		if(usersDao.saveorupdate(users)==true)
		{
			mv.addObject("msg","saved");
			System.out.println("users saved");
			mv.setViewName("redirect:/users");
			return mv;
			
		}
		else
		{
			mv.addObject("msg"," not saved");
			System.out.println("users not saved");
			mv.setViewName("redirect:/users");
		}
		
		return mv;
	}

}
