package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.CartDao;
import com.niit.GiftsBackend.Model.Cart;



public class CartTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Cart c = ( Cart)ctx.getBean("cart");
		CartDao cDao = (CartDao)ctx.getBean("CartDao");
		
		c.setCartId("c101");
		c.setGrandTotal(25000);
		c.setTotalItems(5);
		System.out.println("Cart Id:"+c.getCartId());
		System.out.println("Cart GrandTotal:"+c.getGrandTotal());
		System.out.println("CCart TotalItems:"+c.getTotalItems());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Cart saved");
		}
		else
		{
			System.out.println("Cart not saved");
		}
		
		
	
	   c=cDao.getCart("c101");
	   if(c==null)
	   {
		   System.out.println("Cart not found");
		  
	   }
	   else
	   {
		   System.out.println("Cart Id:"+c.getCartId());
			System.out.println("Cart GrandTotal:"+c.getGrandTotal());
			System.out.println("CCart TotalItems:"+c.getTotalItems());
	   }
	
	   c=cDao.getCart("c101");
	   if(c==null)
	   {
		   System.out.println("Cart not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Cart deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Cart> cartlist = cDao.cartlist();
	   for(Cart c1: cartlist)
	   {
		   System.out.println("Cart Id:"+c.getCartId());
			System.out.println("Cart GrandTotal:"+c.getGrandTotal());
			System.out.println("CCart TotalItems:"+c.getTotalItems());
	   }
}

}
