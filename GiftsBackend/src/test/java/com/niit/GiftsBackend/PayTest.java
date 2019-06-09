package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.PayDao;
import com.niit.GiftsBackend.Model.Pay;



public class PayTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Pay c = ( Pay)ctx.getBean("pay");
		PayDao cDao = (PayDao)ctx.getBean("PayDao");
		
		c.setPayId("c101");
		c.setPayMethod("debit card");
		c.setPayStatus("debit card have been succeessfully payed");
		System.out.println("Pay Id:"+c.getPayId());
		System.out.println("Pay Method:"+c.getPayMethod());
		System.out.println("Pay Status:"+c.getPayStatus());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Pay saved");
		}
		else
		{
			System.out.println("Pay not saved");
		}
		
		
	
	   c=cDao.getPay("c101");
	   if(c==null)
	   {
		   System.out.println("Pay not found");
		  
	   }
	   else
	   {
		   System.out.println("Pay Id: "+c.getPayId() ); 
		   System.out.println("Pay Method:"+c.getPayMethod());
			System.out.println("Pay Status:"+c.getPayStatus());
	   }
	
	   c=cDao.getPay("c101");
	   if(c==null)
	   {
		   System.out.println("Pay not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Pay deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Pay> paylist = cDao.paylist();
	   for(Pay c1: paylist)
	   {
		   System.out.println("Pay Id: "+c.getPayId() ); 
		   System.out.println("Pay Method:"+c.getPayMethod());
			System.out.println("Pay Status:"+c.getPayStatus());
	   }
}

}
