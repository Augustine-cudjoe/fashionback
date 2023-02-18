package com.fashionkings.core.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionkings.core.jpa.ActiveOrInactive;
import com.fashionkings.core.jpa.Product;
import com.fashionkings.core.repository.CategoryRepository;
import com.fashionkings.core.repository.ProductRepository;
import com.fashionkings.core.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	CategoryRepository  categoryRepository;
	
	 @Override
	   public List <Product> allProduct() {
		 
		   Product prod1 =new Product() 
		      .setId(0)
		      .setTitle("Fruits")
		      .setPrice(100)
		      .setDiscount(0)
		      .setStock(0)
		      .setDescription("This is the group of fruits");
		   
		   Product prod2=new Product()
		      .setId(0)
		      .setTitle("Vegetables")
		      .setPrice(100)
		      .setDiscount(0)
		      .setStock(0)
		     .setDescription("This is the group of vegetables");
		   
		   Product prod3=new Product()
				      .setId(0)
				      .setTitle("Vegetables")
				      .setPrice(100)
				      .setDiscount(0)
				      .setStock(0)
				     .setDescription("This is the group of vegetables");
				   
		   List <Product> production = new ArrayList<>();
			   production.add(prod1);
			   production.add(prod2);
		   return production;
	   }

	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow();
	}

	@Override
	public Product add(Product product, long[] categories) {
		
		for(long id: categories) {
			product.addCategory(categoryRepository.findById(id).get());
		}
		
		return productRepository.save(product);
	
	}
    

}
