package com.fashionkings.core.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import com.fashionkings.core.dto.Product;
import com.fashionkings.core.repository.CategoryRepository;
import com.fashionkings.core.repository.ProductRepository;
import com.fashionkings.core.service.CategoryService;
import com.fashionkings.core.service.ProductService;
import com.fashionkings.core.util.MenuMap;

@Controller
@RequestMapping("product")
public class ProuductController {

	
	private ProductService productService;
	private CategoryService categoryService;	
	private ProductRepository  productRepository;
	
	public ProuductController (CategoryService categoryService,ProductService productService ) {
		 super();
		this.categoryService=categoryService;
		this.productService=productService;
		
	}
	
	
	
	
	
	@RequestMapping(value="form", method=RequestMethod.GET)
	 
	 public String form(Model model){
		System.err.print("========== the product form==========");
		model.addAttribute("menu",buildMenu1());
		model.addAttribute("title","Add  a new product");
		model.addAttribute("product", new Product());
		model.addAttribute("categories",categoryService.allCategories());
		 return "product-form";
		  
	 }
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String get(Model model, @PathVariable long id) {
		com.fashionkings.core.jpa.Product product = productService.get(id);
        model.addAttribute("title" , product.getTitle());
        model.addAttribute("product", product);
        model.addAttribute("menu", buildMenu1());
		return "product";
	}
	
	
	
	
	@RequestMapping(value="form", method=RequestMethod.POST)

	public String addProductCategory( Model model, @ModelAttribute Product product){
		model.addAttribute("product", new Product());
		com.fashionkings.core.jpa.Product jpaProduct = new com.fashionkings.core.jpa.Product();
		System.err.println(product);
		jpaProduct.setId(product.getId())
		.setTitle(product.getTitle())
		.setDescription(product.getDescription())
		//productRepository.save(product);
		.setPrice(product.getPrice())
		.setStock(product.getStock())
		.setDiscount(product.getDiscount());
		jpaProduct=productService.add(jpaProduct, product.getCategories());
		model.addAttribute("menu",buildMenu1());
		model.addAttribute("product",jpaProduct);
		 return "product/"+jpaProduct.getId(); 
		  
	}
	

	@RequestMapping(value="list", method = RequestMethod.GET)
	  public String product(Model model) {
	//  List <Product> productList =productService.allProduct();
		//model.addAttribute("production", productList);
		model.addAttribute("menu",buildMenu1());
		return"product-list";
	}
	
	
	private MenuMap buildMenu1()
	 {
		 MenuMap menuMap = new MenuMap ();
		 menuMap.setTitle("Products");
		  menuMap.addPair("List product","/product/list");
		  menuMap.addPair("New product", "/product/form");
		        return menuMap;
	 }
}
