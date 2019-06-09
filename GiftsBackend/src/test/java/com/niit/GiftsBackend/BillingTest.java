package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.BillingDao;

import com.niit.GiftsBackend.Model.Billing;


public class BillingTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Billing c = ( Billing)ctx.getBean("billing");
		BillingDao cDao = (BillingDao)ctx.getBean("BillingDao");
		
		c.setBillId("c101");
		c.setBillName("category1");
		c.setBillCity("Bangalore");
		c.setBillPhoneNo("9964438054");
		c.setBillState("Karnataka");
		System.out.println("Billing Id:"+c.getBillId());
		System.out.println("Billing Name:"+c.getBillName());
		System.out.println("Billing City:"+c.getBillCity());
		System.out.println("Billing PhoneNo:"+c.getBillPhoneNo());
		System.out.println("Billing State:"+c.getBillState());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Billing saved");
		}
		else
		{
			System.out.println("Billing not saved");
		}
		
		
	
	   c=cDao.getBilling("c101");
	   if(c==null)
	   {
		   System.out.println("Billing not found");
		  
	   }
	   else
	   {
		   System.out.println("Billing Id: "+c.getBillId() ); 
		   System.out.println("Billing Name: "+c.getBillName() );  
		   System.out.println("Billing City:"+c.getBillCity());
			System.out.println("Billing PhoneNo:"+c.getBillPhoneNo());
			System.out.println("Billing State:"+c.getBillState());
	   }
	
	   c=cDao.getBilling("c101");
	   if(c==null)
	   {
		   System.out.println("Billing not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Billing deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Billing> billinglist = cDao.billinglist();
	   for(Billing c1: billinglist)
	   {
		   System.out.println("Billing Id: "+c.getBillId() ); 
		   System.out.println("Billing Name: "+c.getBillName() );  
		   System.out.println("Billing City:"+c.getBillCity());
			System.out.println("Billing PhoneNo:"+c.getBillPhoneNo());
			System.out.println("Billing State:"+c.getBillState());
	   }
}

}
