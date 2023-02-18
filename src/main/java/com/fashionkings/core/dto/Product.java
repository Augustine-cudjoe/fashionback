package com.fashionkings.core.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;



public class Product {
	private long id;
	private String title;
	private String description;
	private int stock;
	private int discount;
	private double price;
	private long [] categories;
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public Product setTitle(String title) {
		this.title = title;
		return this;
	}

	public Product setId(long id) {
		this.id = id;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Product setDescription(String description) {
		this.description = description;
		return this;
	}
	public int getStock() {
		return stock;
	}
	public Product setStock(int stock) {
		this.stock = stock;
		return this;
	}
	public int getDiscount() {
		return discount;
	}
	public Product  setDiscount(int discount) {
		this.discount = discount;
		return this;
	}
	public double getPrice() {
		return price;
		
	}
	public Product setPrice(double price) {
		this.price = price;
		return this;
	}

	public long[] getCategories() {
		return categories;
	}

	public Product setCategories(long[] categories) {
		this.categories = categories;
		return this;
	}
	
	 

	
	
	}

	

	

