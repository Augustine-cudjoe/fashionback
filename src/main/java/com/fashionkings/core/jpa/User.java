package com.fashionkings.core.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import java.sql.Date;

import javax.persistence.Column;

@Entity
@Table(name="users")

public class User {

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
