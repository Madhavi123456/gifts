package com.niit.GiftsFrontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GiftsBackend.Dao.CategoryDao;
import com.niit.GiftsBackend.Dao.ProductDao;
import com.niit.GiftsBackend.Dao.SupplierDao;
import com.niit.GiftsBackend.Model.Category;
import com.niit.GiftsBackend.Model.Product;
import com.niit.GiftsBackend.Model.Supplier;
import com.niit.GiftsFrontend.FileInput.FileInput;





@Controller
public class Product1Controller {
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	@Autowired
	Category category;
    @Autowired
    CategoryDao categoryDao;
	@Autowired
	Supplier supplier;
	@Autowired
	SupplierDao supplierDao;
	
	
	String path="C:\\Users\\madhu\\eclipse-workspace\\GiftsFrontend\\src\\main\\webapp\\resources\\images\\img\\product-img\\";
	@RequestMapping("/product1")
	public ModelAndView Product1()
	{
		ModelAndView mv = new ModelAndView();
		List<Category> categorylist=categoryDao.categorylist();
		mv.addObject("category", new Category());
		mv.addObject("categories", categorylist);
		List<Supplier> supplierlist=supplierDao.supplierlist();
		mv.addObject("supplier",new Supplier());
		mv.addObject("suppliers",supplierlist);
		List<Product> productlist = productDao.productlist();
		mv.addObject("product", new Product());
		mv.addObject("Products",productlist);
		mv.setViewName("product1");
		return mv;
	}
	
	@RequestMapping("/addproduct1")
	public ModelAndView addProduct(@ModelAttribute("product") Product product)
	{
		ModelAndView mv = new ModelAndView();
		FileInput.upload(path, product.getPimg(),product.getId()+".jpg");
		if(productDao.saveorupdate(product)==true)
		{
			mv.addObject("msg","saved");
			System.out.println("product1 saved");
			mv.setViewName("redirect:/product1");
			return mv;
			
		}
		else
		{
			mv.addObject("msg"," not saved");
			System.out.println("product1 not saved");
			mv.setViewName("redirect:/product1");
		}
		
		return mv;
	}
	
	@RequestMapping("/editProduct1/{Id}")
	public ModelAndView editProduct(@PathVariable("Id") String Id) {
		ModelAndView mv = new ModelAndView();
		product=productDao.getProduct(Id);
		mv.addObject("product", product);
		List<Product> Products = productDao.productlist();
		mv.addObject("Products", Products);
		mv.setViewName("product1");
		return mv;

	}
	
	@RequestMapping("/deleteProduct1/{Id}")
	public ModelAndView deleteCat(@PathVariable("Id") String Id) {
		ModelAndView mv = new ModelAndView();
		product = productDao.getProduct(Id);
		if (productDao.delete(product) == true) {
			System.out.println("Product1 Deleted");
			mv.addObject("msg", "Product1 Deleted");
		} else {
			System.out.println("Not Deleted ");
			mv.addObject("msg", "Product1 not Deleted");

		}
		mv.setViewName("redirect:/product1");

		return mv;

	}
	
	@RequestMapping(value="/shop",method=RequestMethod.GET)
	public String shop(Model model)
	{
		List<Category> categories=categoryDao.categorylist();
		model.addAttribute("categories", categories);
		List<Product> products=productDao.productlist();
		model.addAttribute("products", products);
		System.out.println(products);
		return "shop";
		
	}
	@RequestMapping(value="/prouct1/{id}",method=RequestMethod.GET)
	public String shop2(@PathVariable("id") String Id,Model model)
	{
		
		List<Category> categories=categoryDao.categorylist();

		model.addAttribute("categories", categories);
		
	List<Product> products=productDao.getProduct1(Id);
		model.addAttribute("products",products);
		System.out.println(products);
		return "shop";
		
	}
	
	
	

}
