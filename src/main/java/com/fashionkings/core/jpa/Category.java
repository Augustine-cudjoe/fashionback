package com.fashionkings.core.jpa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="category_id")
	private long id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	
	
	@ManyToMany(mappedBy="categories")
	private Set <Product> products=new HashSet<>();
	
	public long getId() {
		return id;
	}

	public Category setId(long id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Category setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Category setDescription(String description) {
		this.description = description;
		return this;
	}
	

	

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

	 
}
