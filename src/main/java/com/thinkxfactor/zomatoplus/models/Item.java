package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.br.CNPJ;
@Entity
@Table(name="tbl_item")
public class Item implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	@Column(name="Restaurant_id")
	private Long restaurantId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="description")
	private String description;
	

	public Item(Long id, Long restaurantId, String name, Double price, String description) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
		
	}

	public Item() {
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	/*List<Item> items=new ArrayList<Item>();
	
	public void addItem(Item item) {
		
		items.add(item);
	}*/
}
