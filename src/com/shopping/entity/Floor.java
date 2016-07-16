package com.shopping.entity;

import java.io.Serializable;
import java.util.Date;

public class Floor implements Serializable {

	private static final long serialVersionUID = 8961984179375008718L;
	private int floor_id;
	private String goods_id;
	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Floor(int floor_id, String goods_id) {
		super();
		this.floor_id = floor_id;
		this.goods_id = goods_id;
	}
	public int getFloor_id() {
		return floor_id;
	}
	public void setFloor_id(int floor_id) {
		this.floor_id = floor_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
