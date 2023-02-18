package com.fashionkings.core.util;

import java.util.HashMap;
import java.util.Map;

public class MenuMap {
	private String title;
	private long price;
	
	private long discount;
	
	private long stock;
	private String description;
	
		
	private Map<String, String> menu =new HashMap<>();
	 
	public Map<String , String> getMap(){
		return menu;
	}
	public MenuMap addPair(String key ,String value ) {
		this.menu.put(key, value);
		return this;
	}
	public String getTitle() {
		return this.title;
	}
    
	public MenuMap setTitle(String title){
		this.title=title;
		return this;
	}
	
	public long getPrice() {
		return price;
	}
	public MenuMap setPrice(long price) {
		this.price = price;
		return this;
	}
	public long getDiscount() {
		return discount;
	}
	public MenuMap setDiscount(long discount) {
		this.discount = discount;
		return this;
	}
	public long getStock() {
		return stock;
	}
	public MenuMap setStock(long stock) {
		this.stock = stock;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public MenuMap setDescription(String description) {
		this.description = description;
		return this;
	}

	

}
