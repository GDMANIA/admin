package com.shopping.entity;

import java.io.Serializable;

public class Admin implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String a_name;
	private String a_password;
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_password() {
		return a_password;
	}
	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
	public Admin(String a_name, String a_password) {
		super();
		this.a_name = a_name;
		this.a_password = a_password;
	}
	public Admin() {
		// TODO Auto-generated constructor stub
	}
}
