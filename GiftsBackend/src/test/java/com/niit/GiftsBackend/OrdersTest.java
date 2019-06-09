package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.GiftsBackend.Dao.OrdersDao;

import com.niit.GiftsBackend.Model.Orders;

public class OrdersTest {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Orders c = ( Orders)ctx.getBean("orders");
		OrdersDao cDao = (OrdersDao)ctx.getBean("OrdersDao");
		
		c.setOrderId("c101");
		c.setGrandTotal(250.0);
		
		System.out.println("Orders Id:"+c.getOrderId());
		System.out.println("Orders GrandTotal:"+c.getGrandTotal());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Orders saved");
		}
		else
		{
			System.out.println("Orders not saved");
		}
		
		
	
	   c=cDao.getOrders("c101");
	   if(c==null)
	   {
		   System.out.println("Orders not found");
		  
	   }
	   else
	   {
		   System.out.println("Orders Id: "+c.getOrderId() ); 
		   System.out.println("Orders Name: "+c.getGrandTotal() );  
	   }
	
	   c=cDao.getOrders("c101");
	   if(c==null)
	   {
		   System.out.println("Orders not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Orders deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Orders> orderslist = cDao.orderslist();
	   for(Orders c1: orderslist)
	   {
		   System.out.println("Orders Id: "+c.getOrderId() ); 
		   System.out.println("Orders GrandTotal: "+c.getGrandTotal() );  
	   }
}
}
