package com.fashionkings.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fashionkings.core.service.CategoryService;
import com.fashionkings.core.util.MenuMap;
import com.fashionkings.core.jpa.Category;
import com.fashionkings.core.repository.CategoryRepository;



@Controller

public class CategoryController {
	
	private CategoryService categoryService;
	private CategoryRepository  categoryRepository;
	
	public CategoryController (CategoryService categoryService, CategoryRepository  categoryRepository) {
		this.categoryService=categoryService;
		this.categoryRepository=categoryRepository;
	}
	
	
@RequestMapping(value="category/form", method=RequestMethod.GET)
 
 public String form(Model model){
	model.addAttribute("menu",buildMenu());
	System.err.print("==========simple get==========");
	 return "category-form";
	   
 }

@RequestMapping(value="category/form", method=RequestMethod.POST)

public String addCategory(@ModelAttribute Category category){
	System.out.println(category);
	categoryRepository.save(category);
	 return "category-form"; 
	  
}

 @RequestMapping(value="category/list", method=RequestMethod.GET)
 public String list(Model model) {
	
   List <Category> categoryList =categoryService.allCategories();
	model.addAttribute("categories", categoryList);
	model.addAttribute("menu",buildMenu());
	 return "category-list";  
 }
 @RequestMapping(value="category/details")
 public String getDetails() {
	 return "category-details";
 }
 
 private MenuMap buildMenu()
 {
	 MenuMap menuMap = new MenuMap ();
	 menuMap.setTitle("Categories");
	  menuMap.addPair("List Categories","/category/list");
	  menuMap.addPair("New Category", "/category/form");
	        return menuMap;
 }
}
