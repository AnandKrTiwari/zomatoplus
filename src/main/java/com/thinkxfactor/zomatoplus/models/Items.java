package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//only one main class
@Entity // to convert object of user  to entity
@Table(name="tbl_user") // points to which table the entity(object) maps to


public class Items implements Serializable{//to send the object over network
	@Id //tells that this long ID is the pk of the table
	@GeneratedValue //to tell that id is auto generated
	
	private Long id; //primary key
	
	//@Column(name="username")//maps the next attri to the table
	//private String username;
	
	@Column(name="restaurant_id")
	private String restaurantId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Items() {
		
	}
	
}