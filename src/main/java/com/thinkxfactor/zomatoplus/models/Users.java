package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//models.
@Table(name="tbl_user")
public class Users implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Long id;
	
	@Column(name="type")
	private String type;
	
	@Column(name="name",unique=true)
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="mobile")
	private String mobile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Users() {
		
	}

	public Users(Long id, String type, String name, String password, String landmark, String pincode, String mobile) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.password = password;
		this.landmark = landmark;
		this.pincode = pincode;
		this.mobile = mobile;
	}
	
	
}