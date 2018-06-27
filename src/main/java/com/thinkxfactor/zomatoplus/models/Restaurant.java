/*package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;

public class Restaurant {


@Column(name="")
private String type;
@Column(name="type")
private String type;
@Column(name="type")
private String type;
@Column(name="type")
private String type;


}*/





//creating user object


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


public class Restaurant implements Serializable{//to send the object over network
	@Id //tells that this long ID is the pk of the table
	@GeneratedValue //to tell that id is auto generated
	private Long id; //primary key
	
	//@Column(name="username")//maps the next attri to the table
	//private String username;
	
	@Column(name="city")
	private String city;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="description")
	private String description;
	
	@Column(name="address")
	private String address;
	
	@Column(name="website")
	private String website;
	
	@Column(name="like_count")
	private String likeCount;
	
	
	public long getId() {
		return id;
	}
	
/*	public User(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}*/
	public Restaurant() {
		
	}
	
	
	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}

	public void setId(long id) {
		this.id = id;
	}




		
}