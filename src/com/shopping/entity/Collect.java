package com.shopping.entity;

import java.io.Serializable;

public class Collect implements Serializable {

	private static final long serialVersionUID = 1L;
	private String user_id;
	private String goods_id;
	private String collect_id;

	public Collect() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Collect(String user_id, String goods_id, String collect_id) {
		super();
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.collect_id = collect_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getCollect_id() {
		return collect_id;
	}

	public void setCollect_id(String collect_id) {
		this.collect_id = collect_id;
	}

}
