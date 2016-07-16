package com.shopping.entity;

import java.io.Serializable;

public class UserLoc implements Serializable {

	private static final long serialVersionUID = 1L;
	private String loc_id;
	private String user_id;
	private String user_realname;
	private String user_phonenum;
	private String loc_province;
	private String loc_city;
	private String loc_area;
	private String loc_detail;
	private String loc_default;

	public UserLoc() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public String getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(String loc_id) {
		this.loc_id = loc_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_realname() {
		return user_realname;
	}

	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}

	public String getUser_phonenum() {
		return user_phonenum;
	}

	public void setUser_phonenum(String user_phonenum) {
		this.user_phonenum = user_phonenum;
	}

	public String getLoc_province() {
		return loc_province;
	}

	public void setLoc_province(String loc_province) {
		this.loc_province = loc_province;
	}

	public String getLoc_city() {
		return loc_city;
	}

	public void setLoc_city(String loc_city) {
		this.loc_city = loc_city;
	}

	public String getLoc_area() {
		return loc_area;
	}

	public void setLoc_area(String loc_area) {
		this.loc_area = loc_area;
	}

	public String getLoc_detail() {
		return loc_detail;
	}

	public void setLoc_detail(String loc_detail) {
		this.loc_detail = loc_detail;
	}

	public String getLoc_default() {
		return loc_default;
	}

	public void setLoc_default(String loc_default) {
		this.loc_default = loc_default;
	}

	public UserLoc(String loc_id, String user_id, String user_realname, String user_phonenum, String loc_province,
			String loc_city, String loc_area, String loc_detail, String loc_default) {
		super();
		this.loc_id = loc_id;
		this.user_id = user_id;
		this.user_realname = user_realname;
		this.user_phonenum = user_phonenum;
		this.loc_province = loc_province;
		this.loc_city = loc_city;
		this.loc_area = loc_area;
		this.loc_detail = loc_detail;
		this.loc_default = loc_default;
	}

}
