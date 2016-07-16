package com.shopping.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

//生成一个订单编号
public class OrderNum {
	public static String getOrderNum() {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String time = "ABC" + sf.format(date) + Long.toString(new Date().getTime());
		return time;
	}

	public static void main(String[] args) {
		System.out.println(OrderNum.getOrderNum());
	}
}
