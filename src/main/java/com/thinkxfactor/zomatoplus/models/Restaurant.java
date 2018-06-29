<<<<<<< HEAD
package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
=======
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
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
<<<<<<< HEAD
@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="Restaurant_id")
	private Long id;
	@Column(name="name")
	private String name;
=======

//only one main class
@Entity // to convert object of user  to entity
@Table(name="tbl_user") // points to which table the entity(object) maps to


public class Restaurant implements Serializable{//to send the object over network
	@Id //tells that this long ID is the pk of the table
	@GeneratedValue //to tell that id is auto generated
	private Long id; //primary key
	
	//@Column(name="username")//maps the next attri to the table
	//private String username;
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e
	
	@Column(name="city")
	private String city;
	
<<<<<<< HEAD
	@Column(name="website")
	private String website;
	
	@Column(name="address")
	private String address;
=======
	@Column(name="contact")
	private String contact;
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e
	
	@Column(name="description")
	private String description;
	
<<<<<<< HEAD
	@Column(name="contact")
	private String contact;
	
	@Column(name="like_count")
	private Integer likeCount;
	

	public Restaurant(Long id, String name, String city, String website, String address, String description,
			String contact, Integer likeCount) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.website = website;
		this.address = address;
		this.description = description;
		this.contact = contact;
		this.likeCount = likeCount;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


=======
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
	
	
	
	
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e
	public String getCity() {
		return city;
	}

<<<<<<< HEAD

=======
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e
	public void setCity(String city) {
		this.city = city;
	}

<<<<<<< HEAD

	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}

=======
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
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e

	public String getAddress() {
		return address;
	}

<<<<<<< HEAD

=======
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e
	public void setAddress(String address) {
		this.address = address;
	}

<<<<<<< HEAD

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public Integer getLikeCount() {
		return likeCount;
	}


	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}


	public Restaurant() {
		
	}

}
=======
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
>>>>>>> 6684da26519c8534b6761ba616d51b37d3c5859e
