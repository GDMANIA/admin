package com.shopping.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 8961984179375008718L;
	private String user_id;
	private String user_name;
	private String user_phonenum;
	private String user_password;
	private String user_head;
	private Date user_regtime;
	private Date user_logintime;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String user_id, String user_name, String user_phonenum,
			String user_password, String user_head, Date user_regtime,
			Date user_logintime) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_phonenum = user_phonenum;
		this.user_password = user_password;
		this.user_head = user_head;
		this.user_regtime = user_regtime;
		this.user_logintime = user_logintime;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phonenum() {
		return user_phonenum;
	}

	public void setUser_phonenum(String user_phonenum) {
		this.user_phonenum = user_phonenum;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_head() {
		return user_head;
	}

	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}

	public Date getUser_regtime() {
		return user_regtime;
	}

	public void setUser_regtime(Date user_regtime) {
		this.user_regtime = user_regtime;
	}

	public Date getUser_logintime() {
		return user_logintime;
	}

	public void setUser_logintime(Date user_logintime) {
		this.user_logintime = user_logintime;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_phonenum=" + user_phonenum + ", user_password="
				+ user_password + ", user_head=" + user_head
				+ ", user_regtime=" + user_regtime + ", user_logintime="
				+ user_logintime + "]";
	}

}
