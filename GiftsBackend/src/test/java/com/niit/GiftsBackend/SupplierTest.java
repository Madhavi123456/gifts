//package com.niit.GiftsBackend;
//
//import java.util.List;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.GiftsBackend.Dao.SupplierDao;
//import com.niit.GiftsBackend.Model.Supplier;
//
//
//
//public class SupplierTest {
//
//	public static void main(String args[]) {
//		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
//		ctx.scan("com.niit.*");
//		ctx.refresh();
//		 
//	//	Category c = new Category;
//		Supplier c = (Supplier)ctx.getBean("supplier");
//		SupplierDao cDao = (SupplierDao)ctx.getBean("SupplierDao");
//		
//		c.setId("c101");
//		c.setName("category1");
//		c.setAdddress("bangalore");
//		c.setEmailId("xyz@gmail.com");
//		System.out.println("Supplier Id:"+c.getId());
//		System.out.println("Supplier Name:"+c.getName());
//		System.out.println("Supplier Address:"+c.getAdddress());
//		System.out.println("Supplier EmailId:"+c.getEmailId());
//		
//		if(cDao.saveorupdate(c)==true)
//		{
//			System.out.println("Suppliersaved");
//		}
//		else
//		{
//			System.out.println("Supplier not saved");
//		}
//		
//		
//	
//	   c=cDao.getSupplier("c101");
//	   if(c==null)
//	   {
//		   System.out.println("Supplier not found");
//		  
//	   }
//	   else
//	   {
//		   System.out.println("Supplier Id: "+c.getId() ); 
//		   System.out.println("Supplier Name: "+c.getName() );  
//		   System.out.println("Supplier Address:"+c.getAdddress());
//			System.out.println("Supplier EmailId:"+c.getEmailId());
//	   }
//	
//	   c=cDao.getSupplier("c101");
//	   if(c==null)
//	   {
//		   System.out.println("Supplier not found");
//		  
//	   }
//	   else if(cDao.delete(c)==true)
//	   {
//		   System.out.println("Supplier deleted" ); 
//		  
//	   }
//	   
//	   else
//	   {
//		 System.out.println("Supplier not deleted");
//	   }
//	
//	   List<Supplier> supplierlist = cDao.supplierlist();
//	   for(Supplier c1: supplierlist)
//	   {
//		   System.out.println("Supplier Id: "+c.getId() ); 
//		   System.out.println("Supplier Name: "+c.getName() );  
//		   System.out.println("Supplier Address:"+c.getAdddress());
//			System.out.println("Supplier EmailId:"+c.getEmailId());
//	   }
//}
//}
//	
//	
//	
//
