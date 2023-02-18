package com.fashionkings.core.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="users_id")
	
    private long id;
	@Column(name="price")
	private int price;
	
	@Column(name="discount")
	private int discount;
	
	@Column(name="stock")
	private int  stock;
	

	@Column(name="created" ,nullable=true)
	private Date created;
	

	@Column(name="updated" ,nullable=true)
	private Date updated;
	
	@Column(name="delected" )
	private boolean delected=Boolean.FALSE;
	
	@Column(name="description")
	private String description;

}
