package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.GiftsBackend.Dao.ShippingDao;

import com.niit.GiftsBackend.Model.Shipping;

public class ShippingTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Shipping c = (Shipping)ctx.getBean("shipping");
		ShippingDao cDao = (ShippingDao)ctx.getBean("ShippingDao");
		
		c.setShipId("c101");
		c.setShipName("category1");
		c.setShipCity("Bangalore");
		c.setShipPhoneNo("9164488089");
		c.setShipState("Karnataka");
		System.out.println("Shipping Id:"+c.getShipId());
		System.out.println("Shipping Name:"+c.getShipName());
		System.out.println("Shipping City:"+c.getShipCity());
		System.out.println("Shipping PhoneNo:"+c.getShipPhoneNo());
		System.out.println("Shipping State:"+c.getShipState());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Shipping saved");
		}
		else
		{
			System.out.println("Shipping not saved");
		}
		
		
	
	   c=cDao.getShipping("c101");
	   if(c==null)
	   {
		   System.out.println("Shipping not found");
		  
	   }
	   else
	   {
		   System.out.println("Shipping Id: "+c.getShipId() ); 
		   System.out.println("Shipping Name: "+c.getShipName() );  
		   System.out.println("Shipping City:"+c.getShipCity());
			System.out.println("Shipping PhoneNo:"+c.getShipPhoneNo());
			System.out.println("Shipping State:"+c.getShipState());
	   }
	
	   c=cDao.getShipping("c101");
	   if(c==null)
	   {
		   System.out.println("Shipping not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Shipping deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Shipping> shippinglist = cDao.shippinglist();
	   for(Shipping c1: shippinglist)
	   {
		   System.out.println("Shipping Id: "+c.getShipId() ); 
		   System.out.println("Shipping Name: "+c.getShipName() );  
		   System.out.println("Shipping City:"+c.getShipCity());
			System.out.println("Shipping PhoneNo:"+c.getShipPhoneNo());
			System.out.println("Shipping State:"+c.getShipState());
	   }
}

}
