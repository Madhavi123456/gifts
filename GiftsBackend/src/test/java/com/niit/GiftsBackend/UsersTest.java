package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.UsersDao;
import com.niit.GiftsBackend.Model.Users;



public class UsersTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Users c = ( Users)ctx.getBean("users");
		UsersDao cDao = (UsersDao)ctx.getBean("UsersDao");
		
		c.setId("c101");
		c.setName("category1");
		c.setPassword("abc");
		c.setPhoneNo("9448734954");
		c.setEmailId("xyz@gmail.com");
		System.out.println("Users Id:"+c.getId());
		System.out.println("Users Name:"+c.getName());
		System.out.println("Users Password:"+c.getPassword());
		System.out.println("Users PhoneNo:"+c.getPhoneNo());
		System.out.println("Users EmailId:"+c.getEmailId());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Users saved");
		}
		else
		{
			System.out.println("Users not saved");
		}
		
		
	
	   c=cDao.getUsers("c101");
	   if(c==null)
	   {
		   System.out.println("Users not found");
		  
	   }
	   else
	   {
		   System.out.println("Users Id: "+c.getId() ); 
		   System.out.println("Users Name: "+c.getName() );  
		   System.out.println("Users Password:"+c.getPassword());
			System.out.println("Users PhoneNo:"+c.getPhoneNo());
			System.out.println("Users EmailId:"+c.getEmailId());
			
	   }
	
	   c=cDao.getUsers("c101");
	   if(c==null)
	   {
		   System.out.println("Users not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Users deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Users> userslist = cDao.userslist();
	   for(Users c1: userslist)
	   {
		   System.out.println("Users Id: "+c.getId() ); 
		   System.out.println("Users Name: "+c.getName() );  
		   System.out.println("Users Password:"+c.getPassword());
			System.out.println("Users PhoneNo:"+c.getPhoneNo());
			System.out.println("Users EmailId:"+c.getEmailId());
			
	   }
}

}
