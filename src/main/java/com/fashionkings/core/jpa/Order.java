package com.fashionkings.core.jpa;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	

	private static final boolean True = false;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="order_id")
	 private long id;
	
	@Column(name="order_number")
	private int orderNumber;
	

	@Column(name="created" )
	private Date created;
	

	@Column(name="updated" )
	private Date updated;
	
	@Column(name="delected" )
	private boolean delected=Boolean.FALSE;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL, orphanRemoval=True)
	private List <OrderItem> items = new ArrayList<>();
	
}
