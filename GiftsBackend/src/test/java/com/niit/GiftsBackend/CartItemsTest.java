package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.CartItemsDao;
import com.niit.GiftsBackend.Model.CartItems;



public class CartItemsTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		CartItems c = ( CartItems)ctx.getBean("cartItems");
		CartItemsDao cDao = (CartItemsDao)ctx.getBean("CartItemsDao");
		
		c.setCartItemId("c101");
		c.setPrice(15000);
		System.out.println("CartItems Id:"+c.getCartItemId());
		System.out.println("CartItems Price:"+c.getPrice());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("CartItems saved");
		}
		else
		{
			System.out.println("CartItems not saved");
		}
		
		
	
	   c=cDao.getCartItems("c101");
	   if(c==null)
	   {
		   System.out.println("CartItems not found");
		  
	   }
	   else
	   {
		   System.out.println("CartItems Id: "+c.getCartItemId() ); 
		   System.out.println("CartItems Price:"+c.getPrice());
		 
	   }
	
	   c=cDao.getCartItems("c101");
	   if(c==null)
	   {
		   System.out.println("CartItems not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("CartItems deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
//	   List<CartItems> cartItemslist = cDao.cartItemslist();
//	   for(CartItems c1: cartItemslist)
//	   {
//		   System.out.println("CartItems Id: "+c.getCartItemId() ); 
//		   System.out.println("CartItems Price:"+c.getPrice());
//		   
//	   }
}

}
