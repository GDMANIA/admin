package com.shopping.entity;

import java.io.Serializable;

public class Goods implements Serializable {

	private static final long serialVersionUID = 1L;

	private String goods_id;
	private String goods_storename;
	private String goods_name;
	private String goods_introduce;
	private double goods_formerprice;
	private double goods_price;
	
	public Goods(String goods_id, String goods_storename,
			String goods_introduce, double goods_formerprice,
			double goods_price, int goods_count, String goods_fivepicture,
			String goods_fivepicture1, String goods_fivepicture2,
			String goods_fivepicture3, String goods_fivepicture4) {
		super();
		this.goods_id = goods_id;
		this.goods_storename = goods_storename;
		this.goods_introduce = goods_introduce;
		this.goods_formerprice = goods_formerprice;
		this.goods_price = goods_price;
		this.goods_count = goods_count;
		this.goods_fivepicture = goods_fivepicture;
		this.goods_fivepicture1 = goods_fivepicture1;
		this.goods_fivepicture2 = goods_fivepicture2;
		this.goods_fivepicture3 = goods_fivepicture3;
		this.goods_fivepicture4 = goods_fivepicture4;
	}

	private int goods_count;
	private int goods_salcout;
	private int goods_evaluatcout;
	private String goods_fivepicture;
	private String goods_fivepicture1;
	private String goods_fivepicture2;
	private String goods_fivepicture3;
	private String goods_fivepicture4;

	
	public String getGoods_id() {
		return goods_id;
	}

	public String getGoods_fivepicture1() {
		return goods_fivepicture1;
	}

	public void setGoods_fivepicture1(String goods_fivepicture1) {
		this.goods_fivepicture1 = goods_fivepicture1;
	}

	public String getGoods_fivepicture2() {
		return goods_fivepicture2;
	}

	public void setGoods_fivepicture2(String goods_fivepicture2) {
		this.goods_fivepicture2 = goods_fivepicture2;
	}

	public String getGoods_fivepicture3() {
		return goods_fivepicture3;
	}

	public void setGoods_fivepicture3(String goods_fivepicture3) {
		this.goods_fivepicture3 = goods_fivepicture3;
	}

	public String getGoods_fivepicture4() {
		return goods_fivepicture4;
	}

	public void setGoods_fivepicture4(String goods_fivepicture4) {
		this.goods_fivepicture4 = goods_fivepicture4;
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

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(String goods_id, String goods_storename, String goods_name,
			String goods_introduce, double goods_formerprice,
			double goods_price, int goods_count, int goods_salcout,
			int goods_evaluatcout, String goods_fivepicture,String goods_fivepicture1,String goods_fivepicture2,String goods_fivepicture3,String goods_fivepicture4) {
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
		this.goods_fivepicture1 = goods_fivepicture1;
		this.goods_fivepicture2= goods_fivepicture2;
		this.goods_fivepicture3 = goods_fivepicture3;
		this.goods_fivepicture4 = goods_fivepicture4;
		
	}


}
