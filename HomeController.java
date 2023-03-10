package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping({"/","/home"})
	public String home(Model model)
	{
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop(Model model)
	{
		model.addAttribute("products",productService.getAllProducts());
		model.addAttribute("categories", categoryService.getAllCategories());
		return "shop";
	}
	
	@GetMapping("/shop/category/{id}")
	public String shopByCategory(Model model,@PathVariable int id)
	{
		model.addAttribute("products", productService.getAllProductsByCategoryId(id));
		model.addAttribute("category", categoryService.getAllCategories());
		return "shop";
	}
	
	@GetMapping("/shop/viewproduct/{id}")
	public String viewProduct(Model model,@PathVariable int id)
	{
		model.addAttribute("product", productService.getProductById(id).get());
		return "viewProduct";
	}
}
