package com.fashionkings.core.service;

import java.util.List;

import com.fashionkings.core.jpa.Product;

public interface ProductService {
	
	List <Product> allProduct ();
	
	Product get(long id );
	Product add(Product product,long [] categories);

}
