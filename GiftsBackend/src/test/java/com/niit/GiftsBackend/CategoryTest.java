package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.CategoryDao;
import com.niit.GiftsBackend.Model.Category;

public class CategoryTest {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Category c = ( Category)ctx.getBean("category");
		CategoryDao cDao = (CategoryDao)ctx.getBean("CategoryDao");
		
		c.setCatId("c101");
		c.setCatName("category1");
		System.out.println("Category Id:"+c.getCatId());
		System.out.println("Category Name:"+c.getCatName());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("category saved");
		}
		else
		{
			System.out.println("category not saved");
		}
		
		
	
	   c=cDao.getCategory("c101");
	   if(c==null)
	   {
		   System.out.println("category not found");
		  
	   }
	   else
	   {
		   System.out.println("category Id: "+c.getCatId() ); 
		   System.out.println("category Name: "+c.getCatName() );  
	   }
	
	   c=cDao.getCategory("c101");
	   if(c==null)
	   {
		   System.out.println("category not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("category deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Category> categorylist = cDao.categorylist();
	   for(Category c1: categorylist)
	   {
		   System.out.println("category Id: "+c.getCatId() ); 
		   System.out.println("category Name: "+c.getCatName() );  
	   }
}
}
	
	
	

