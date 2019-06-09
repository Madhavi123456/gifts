package com.niit.GiftsFrontend.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GiftsBackend.Dao.CartDao;
import com.niit.GiftsBackend.Dao.CartItemsDao;
import com.niit.GiftsBackend.Dao.CategoryDao;
import com.niit.GiftsBackend.Dao.ProductDao;
import com.niit.GiftsBackend.Dao.UsersDao;
import com.niit.GiftsBackend.Model.Cart;
import com.niit.GiftsBackend.Model.CartItems;
import com.niit.GiftsBackend.Model.Category;
import com.niit.GiftsBackend.Model.Product;
import com.niit.GiftsBackend.Model.Users;

@Controller
public class CartController {

	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	@Autowired
	Users users;
	@Autowired
	UsersDao usersDao;
	@Autowired
	Cart cart;
	@Autowired
	CartDao cartDao;
	@Autowired
	CartItems cartItems;
	@Autowired
	CartItemsDao cartItemDao;
	@Autowired
	Category category;
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value="/cart")
	public String getCartItems(Model model)
	{
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		if(!(authentication instanceof AnonymousAuthenticationToken))
		{
			
			String currusername= authentication.getName();
			System.out.println(currusername);
			users=usersDao.getUsersbyemail(currusername);
			if(users==null)
			{
				return "redirect:/login";
			
			}
			else
			{
			List<CartItems> ci=cartItemDao.cartItemslist(users.getCart().getCartId());
			if(ci==null || ci.isEmpty())
			{
				model.addAttribute("mess","no items added to cart");
				return "cart";
				
			}
			else {
				for(CartItems c:ci)
				{
					System.out.println(c.getProduct().getName());
					System.out.println(c.getProduct().getName());
				}
			}
			model.addAttribute("CartItems",ci);
			model.addAttribute("cart",users.getCart());
			
			
			}
	}
		return "cart";
		
	}
	
	@RequestMapping(value="/viewproducts")
	public String getProductByCat(@PathVariable("id")String id,Model model)
	{
		List<Category> categories= categoryDao.categorylist();
		model.addAttribute("categories",categories);
		List<Product> products=productDao.productlist();
		model.addAttribute("products",products);
		System.out.println(products);
		return "viewproducts";
		
	}
	
	@RequestMapping(value="/addTocart/{ProductId}")
	public String addToCart(@PathVariable("ProductId")String id,Model model)
	{
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		if(!(authentication instanceof AnonymousAuthenticationToken))
		{
			System.out.println(12345);
		      String currentUsername=authentication.getName();
		      System.out.println(currentUsername);
		      users=usersDao.getUsersbyemail(currentUsername);
		      if(users==null)
		    	  return "redirect:/login";
		      else
		      {
		    	  Cart c=users.getCart();
		    	  System.out.println(c.getCartId());
		    	  product=productDao.getProduct(id);
		    	  CartItems cartItems=new CartItems();
		    	  cartItems.setProduct(product);
		    	  cartItems.setCart(c);
		    	  System.out.println(675543);
		    	  cartItems.setPrice(product.getPrice());
		    	  if(cartItemDao.saveorupdate(cartItems))
		    	  {
		    	 	  int t=c.getTotalItems()+1;
		    		  double p=c.getGrandTotal()+product.getPrice();
		    		  c.setGrandTotal(p);
		    		  c.setTotalItems(t);
		    		  cartDao.saveorupdate(c);
		    	  }  
		    	  System.out.println(86875);

		    	  
		    	  return "redirect:/cart";
		      }
		}
		return "redirect:/cart";
	}
	
	@RequestMapping(value="/remove/cartitems/{cartitemsid}")
	public String removeCartItems(@PathVariable("cartitemsid")String cartitemsid,Model model)
	{
		CartItems c=cartItemDao.getCartItems(cartitemsid);
		Cart c1=c.getCart();
		c1.setGrandTotal(c1.getGrandTotal()-c.getPrice());
		c1.setTotalItems(c1.getTotalItems()-1);
		cartDao.saveorupdate(c1);
		cartItemDao.delete(c);
		return "redirect:/cart";
	}
	


	
	
	

}

