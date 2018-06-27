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


public class User implements Serializable{//to send the object over network
	@Id //tells that this long ID is the pk of the table
	@GeneratedValue //to tell that id is auto generated
	private Long id; //primary key
	
	@Column(name="user")//maps the next attri to the table
	private String user;
	
	//@Column(name="name")
	//private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	@Column(name="password")
	private String password;
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="pincode")
	private String pincode;
	
	
	
	public User(String user, String password) {
		super();
		this.user = user;
		this.Password = password;
	}
	public User() {
		
	}
	@Column(name="password")
	private String Password;
	
	public String getuser() {
		return user;
	}
	public void setuser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
