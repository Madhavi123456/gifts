package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.AuthenticationDao;
import com.niit.GiftsBackend.Model.Authentication;


public class AuthenticationTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Authentication c = ( Authentication)ctx.getBean("authentication");
		AuthenticationDao cDao = (AuthenticationDao)ctx.getBean("authenticationDao");
		
		c.setRoleId("c101");
		c.setRole_Name("category1");
		c.setUserName("abc");
		System.out.println("Authentication Id:"+c.getRoleId());
		System.out.println("Authentication Name:"+c.getRole_Name());
		System.out.println("Authentication UserName:"+c.getUserName());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Authentication saved");
		}
		else
		{
			System.out.println("Authentication not saved");
		}
		
		
	
	   c=cDao.getAuthentication("c101");
	   if(c==null)
	   {
		   System.out.println("Authentication not found");
		  
	   }
	   else
	   {
		   System.out.println("Authentication Id: "+c.getRoleId() ); 
		   System.out.println("Authentication Name: "+c.getRole_Name() );  
		   System.out.println("Authentication UserName:"+c.getUserName());
	   }
	
	   c=cDao.getAuthentication("c101");
	   if(c==null)
	   {
		   System.out.println("Authentication not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Authentication deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Authentication> authenticationlist = cDao.authenticationlist();
	   for(Authentication c1: authenticationlist)
	   {
		   System.out.println("Authentication Id: "+c1.getRoleId() ); 
		   System.out.println("Authentication Name: "+c1.getRole_Name() );  
		   System.out.println("Authentication UserName:"+c1.getUserName());
	   }
}
}
	

