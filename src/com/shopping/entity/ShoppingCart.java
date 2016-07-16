package com.shopping.entity;

import java.io.Serializable;

public class ShoppingCart implements Serializable {

	private static final long serialVersionUID = 1L;
	private String user_id;
	private String goods_id;
	private String goods_state;
	private String order_num;
	public int goods_num;

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

	public String getGoods_state() {
		return goods_state;
	}

	public void setGoods_state(String goods_state) {
		this.goods_state = goods_state;
	}

	public String getOrder_num() {
		return order_num;
	}

	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}

	public int getGoods_num() {
		return goods_num;
	}

	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}

	public ShoppingCart(String user_id, String goods_id, String goods_state, String order_num, int goods_num) {
		super();
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.goods_state = goods_state;
		this.order_num = order_num;
		this.goods_num = goods_num;
	}

	public ShoppingCart() {
		super();
		// TODO 自动生成的构造函数存根
	}

}
