package com.niit.GiftsFrontend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.niit.GiftsBackend.Model.Supplier;
import com.niit.GiftsBackend.Dao.SupplierDao;

import java.util.List;


@Controller
public class SupplierController {
	@Autowired
	Supplier supplier;
	@Autowired
	SupplierDao supplierDao;
	@RequestMapping("/supplier")
	public ModelAndView Supplier()
	{
		ModelAndView mv = new ModelAndView();
		List<Supplier> supplierlist = supplierDao.supplierlist();
		mv.addObject("supplier", new Supplier());
		mv.addObject("Suppliers",supplierlist);
		mv.setViewName("supplier");
		return mv;
	}
	
	@RequestMapping("/addsup")
	public ModelAndView addSupplier(@ModelAttribute("supplier") Supplier supplier)
	{
		ModelAndView mv = new ModelAndView();
		if(supplierDao.saveorupdate(supplier)==true)
		{
			mv.addObject("msg","saved");
			System.out.println("supplier saved");
			mv.setViewName("redirect:/supplier");
			return mv;
			
		}
		else
		{
			mv.addObject("msg"," not saved");
			System.out.println("supplier not saved");
			mv.setViewName("redirect:/supplier");
		}
		
		return mv;
	}
	
	@RequestMapping("/editSupplier/{supId}")
	public ModelAndView editSupplier(@PathVariable("supId") String supId) {
		ModelAndView mv = new ModelAndView();
		supplier=supplierDao.getSupplier(supId);
		mv.addObject("supplier", supplier);
		List<Supplier> Suppliers = supplierDao.supplierlist();
		mv.addObject("Suppliers", Suppliers);
		mv.setViewName("supplier");
		return mv;

	}
	
	@RequestMapping("/deleteSupplier/{supId}")
	public ModelAndView deleteSupplier(@PathVariable("supId") String supId) {
		ModelAndView mv = new ModelAndView();
		supplier = supplierDao.getSupplier(supId);
		if (supplierDao.delete(supplier) == true) {
			System.out.println("Supplier Deleted");
			mv.addObject("msg", "Supplier Deleted");
		} else {
			System.out.println("Not Deleted ");
			mv.addObject("msg", "Supplier not Deleted");

		}
		mv.setViewName("redirect:/supplier");

		return mv;

	}

}
