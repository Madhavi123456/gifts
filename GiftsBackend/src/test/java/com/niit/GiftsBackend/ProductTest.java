package com.niit.GiftsBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.GiftsBackend.Dao.ProductDao;
import com.niit.GiftsBackend.Model.Product;



public class ProductTest {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		 
	//	Category c = new Category;
		Product c = ( Product)ctx.getBean("product");
		ProductDao cDao = (ProductDao)ctx.getBean("ProductDao");
		
		c.setId("c101");
		c.setName("category1");
		c.setPrice(1500);
		c.setQuantity(10);
		c.setDescription("");
		System.out.println("Product Id:"+c.getId());
		System.out.println("Product Name:"+c.getName());
		System.out.println("Product Price:"+c.getPrice());
		System.out.println("Product Quantity:"+c.getQuantity());
		System.out.println("Product Description:"+c.getDescription());
		
		if(cDao.saveorupdate(c)==true)
		{
			System.out.println("Product saved");
		}
		else
		{
			System.out.println("Product not saved");
		}
		
		
	
	   c=cDao.getProduct("c101");
	   if(c==null)
	   {
		   System.out.println("Product not found");
		  
	   }
	   else
	   {
		   System.out.println("Product Id: "+c.getId() ); 
		   System.out.println("Product Name: "+c.getName() );
		   System.out.println("Product Price:"+c.getPrice());
			System.out.println("Product Quantity:"+c.getQuantity());
			System.out.println("Product Description:"+c.getDescription());
	   }
	
	   c=cDao.getProduct("c101");
	   if(c==null)
	   {
		   System.out.println("Product not found");
		  
	   }
	   else if(cDao.delete(c)==true)
	   {
		   System.out.println("Product deleted" ); 
		  
	   }
	   
	   else
	   {
		 System.out.println("not deleted");
	   }
	
	   List<Product> productlist = cDao.productlist();
	   for(Product c1: productlist)
	   {
		   System.out.println("Product Id: "+c.getId() ); 
		   System.out.println("Product Name: "+c.getName() );
		   System.out.println("Product Price:"+c.getPrice());
			System.out.println("Product Quantity:"+c.getQuantity());
			System.out.println("Product Description:"+c.getDescription());
	   }
}

}
