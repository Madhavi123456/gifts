package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.OrderItemsDao;
import com.niit.GiftsBackend.Model.OrderItems;



public class OrderItemsTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		OrderItems c = ( OrderItems)ctx.getBean("orderItems");
		OrderItemsDao cDao = (OrderItemsDao)ctx.getBean("OrderItemsDao");
		
		c.setOrderItemId("c101");
		c.setProductId("p101");
		System.out.println("OrderItems Id:"+c.getOrderItemId());
		System.out.println("OrderItems ProductId:"+c.getProductId());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("OrderItems saved");
		}
		else
		{
			System.out.println("OrderItems not saved");
		}
		
		
	
	   c=cDao.getOrderItems("c101");
	   if(c==null)
	   {
		   System.out.println("OrderItems not found");
		  
	   }
	   else
	   {
		   System.out.println("OrderItems Id: "+c.getOrderItemId() ); 
		   System.out.println("OrderItems ProductId:"+c.getProductId());  
	   }
	
	   c=cDao.getOrderItems("c101");
	   if(c==null)
	   {
		   System.out.println("OrderItems not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("OrderItems deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<OrderItems> orderItemslist = cDao.orderItemslist();
	   for(OrderItems c1: orderItemslist)
	   {
		   System.out.println("OrderItems Id: "+c.getOrderItemId() ); 
		   System.out.println("OrderItems ProductId:"+c.getProductId());
	   }
}

}
