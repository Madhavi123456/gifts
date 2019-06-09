package com.niit.GiftsFrontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GiftsBackend.Model.Cart;
import com.niit.GiftsBackend.Model.CartItems;
import com.niit.GiftsBackend.Model.Category;
import com.niit.GiftsBackend.Model.Product;
import com.niit.GiftsBackend.Dao.CategoryDao;

@Controller
public class CategoryController {
	@Autowired
	Category category;
	@Autowired
	CategoryDao categoryDao;
	@RequestMapping("/category")
	public ModelAndView Category()
	{
		ModelAndView mv = new ModelAndView();
		List<Category> categorylist = categoryDao.categorylist();
		mv.addObject("category", new Category());
		mv.addObject("Categories", categorylist);
		mv.setViewName("category");
		return mv;
	}
	
	@RequestMapping("/addcat")
	public ModelAndView addCategory(@ModelAttribute("category") Category category)
	{
		ModelAndView mv = new ModelAndView();
		if(categoryDao.saveorupdate(category)==true)
		{
			mv.addObject("msg","saved");
			System.out.println("category saved");
			mv.setViewName("redirect:/category");
			return mv;
			
		}
		else
		{
			mv.addObject("msg"," not saved");
			System.out.println("category not saved");
			mv.setViewName("redirect:/category");
		}
		
		return mv;
	}
	
	@RequestMapping("/editCategory/{CatId}")
	public ModelAndView editCat(@PathVariable("CatId") String catId) {
		ModelAndView mv = new ModelAndView();
		category=categoryDao.getCategory(catId);
		mv.addObject("category", category);
		List<Category> Categories = categoryDao.categorylist();
		mv.addObject("Catgeories", Categories);
		mv.setViewName("category");
		return mv;

	}
	
	@RequestMapping("/deleteCategory/{CatId}")
	public ModelAndView deleteCat(@PathVariable("CatId") String catId) {
		ModelAndView mv = new ModelAndView();
		category = categoryDao.getCategory(catId);
		if (categoryDao.delete(category) == true) {
			System.out.println("Category Deleted");
			mv.addObject("msg", "Category Deleted");
		} else {
			System.out.println("Not Deleted ");
			mv.addObject("msg", "Category not Deleted");

		}
		mv.setViewName("redirect:/category");

		return mv;

	}
	
	
}
