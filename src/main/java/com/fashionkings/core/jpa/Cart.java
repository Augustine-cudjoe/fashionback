package com.fashionkings.core.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carts")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_id")
	
    private long id;
	
	@Column(name="status")
	private int status;
	
	@Column(name="created" )
	private Date created;
	

	@Column(name="updated" )
	private Date updated;
	
	@Column(name="delected" )
	private boolean delected=Boolean.FALSE;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public boolean isDelected() {
		return delected;
	}

	public void setDelected(boolean delected) {
		this.delected = delected;
	}
	
	
	

}
