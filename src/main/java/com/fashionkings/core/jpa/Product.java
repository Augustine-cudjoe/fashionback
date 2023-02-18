package com.fashionkings.core.jpa;

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


@Entity
@Table(name="products")
public class Product {
	private static final boolean True = false;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private long id;
	
	@Column(name="title")
	private String title;
 
	@Column(name="price")
	private double price;
	
	@Column(name="discount")
	private int discount;
	
	@Column(name="stock")
	private int  stock;
	
	@Column(name="status")
	private String status;
	
	@Column(name="created" )
	private Date created; 
	

	@Column(name="updated" )
	private Date updated;
	
	@Column(name="delected" )
	private boolean delected=Boolean.FALSE;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="product",cascade=CascadeType.ALL, orphanRemoval=True)
	private List <OrderItem> orderItems = new ArrayList<>();
	 
	@ManyToMany(cascade= {
			CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.REFRESH
			})
	
	@JoinTable(name="product_categories",
	 joinColumns= @JoinColumn(name="product_id"),
	 inverseJoinColumns= @JoinColumn(name="category_id"))
	
	private Set<Category> categories =new HashSet<>();

	
	
	public String getStatus() {
		return status;
	}

	public Product setStatus(String status) {
		this.status = status;
		return this;
	}

	public Date getCreated() {
		return created;
	}

	public Product setCreated(Date created) {
		this.created = created;
		return this;
	}

	public Date getUpdated() {
		return updated;
	}

	public Product setUpdated(Date updated) {
		this.updated = updated;
		return this;
	}

	public boolean isDelected() {
		return delected;
	}

	public Product setDelected(boolean delected) {
		this.delected = delected;
		return this;
	}



	public long getId() {
		return id;
	}

	public Product setId(long id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Product setTitle(String title) {
		this.title = title;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public Product setPrice(double price) {
		this.price = price;
		return this;
	}

	public int getDiscount() {
		return discount;
	}

	public Product setDiscount(int discount) {
		this.discount = discount;
		return this;
	}

	public int getStock() {
		return stock;
	}

	public Product setStock(int stock) {
		this.stock = stock;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Product setDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", discount=" + discount + ", stock="
				+ stock + ", status=" + status + ", created=" + created + ", updated=" + updated + ", delected="
				+ delected + ", description=" + description + "]";
	}

	

	

	public void addCategory(Category category) {
		categories.add(category);
		category.getProducts().add(this);
    }
 
    public void removeCategory(Category category) {
    	categories.remove(category);
        category.getProducts().remove(this);
	}
	
}
