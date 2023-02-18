package com.fashionkings.core.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_item_id")
	
    private long id;
	@Column(name="price")
	private int price;
	
	
	
	@Column(name="stock")
	private int  stock;
	

	@Column(name="created" )
	private Date created;
	

	@Column(name="updated" )
	private Date updated;
	
	@Column(name="delected" )
	private boolean delected=Boolean.FALSE;
	


}
