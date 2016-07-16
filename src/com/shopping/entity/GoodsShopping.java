package com.shopping.entity;

import java.io.Serializable;

public class GoodsShopping implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4226843702847190865L;
	private String goods_id;
	private String goods_storename;
	private String goods_name;
	private String goods_introduce;
	private double goods_formerprice;
	private double goods_price;

	private int goods_count;
	private int goods_salcout;
	private int goods_evaluatcout;
	private String goods_fivepicture;
	private String user_id;

	private String goods_state;
	private String order_num;
	public int goods_num;

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_storename() {
		return goods_storename;
	}

	public void setGoods_storename(String goods_storename) {
		this.goods_storename = goods_storename;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_introduce() {
		return goods_introduce;
	}

	public void setGoods_introduce(String goods_introduce) {
		this.goods_introduce = goods_introduce;
	}

	public double getGoods_formerprice() {
		return goods_formerprice;
	}

	public void setGoods_formerprice(double goods_formerprice) {
		this.goods_formerprice = goods_formerprice;
	}

	public double getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}

	public int getGoods_count() {
		return goods_count;
	}

	public void setGoods_count(int goods_count) {
		this.goods_count = goods_count;
	}

	public int getGoods_salcout() {
		return goods_salcout;
	}

	public void setGoods_salcout(int goods_salcout) {
		this.goods_salcout = goods_salcout;
	}

	public int getGoods_evaluatcout() {
		return goods_evaluatcout;
	}

	public void setGoods_evaluatcout(int goods_evaluatcout) {
		this.goods_evaluatcout = goods_evaluatcout;
	}

	public String getGoods_fivepicture() {
		return goods_fivepicture;
	}

	public void setGoods_fivepicture(String goods_fivepicture) {
		this.goods_fivepicture = goods_fivepicture;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public GoodsShopping() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public GoodsShopping(String goods_id, String goods_storename, String goods_name, String goods_introduce,
			double goods_formerprice, double goods_price, int goods_count, int goods_salcout, int goods_evaluatcout,
			String goods_fivepicture, String user_id, String goods_state, String order_num, int goods_num) {
		super();
		this.goods_id = goods_id;
		this.goods_storename = goods_storename;
		this.goods_name = goods_name;
		this.goods_introduce = goods_introduce;
		this.goods_formerprice = goods_formerprice;
		this.goods_price = goods_price;
		this.goods_count = goods_count;
		this.goods_salcout = goods_salcout;
		this.goods_evaluatcout = goods_evaluatcout;
		this.goods_fivepicture = goods_fivepicture;
		this.user_id = user_id;
		this.goods_state = goods_state;
		this.order_num = order_num;
		this.goods_num = goods_num;
	}

}
