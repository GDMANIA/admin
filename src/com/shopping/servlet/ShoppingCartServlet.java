package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.ShoppingCartDao;
import com.shopping.daoimpl.ShoppingCartDaoImpl;
import com.shopping.entity.ShoppingCart;

@WebServlet("/user/page_goods/shoppingcart.do")
// 加到购物车
public class ShoppingCartServlet extends HttpServlet {

	private static final long serialVersionUID = -1731307136294125603L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String goods_id = request.getParameter("goods_id");
		String user_id = request.getParameter("user_id");
		String goods_state = "0";
		String order_num = "0";
		int goods_num = 1;
		// System.out.println(goods_id + "------" + user_id);
		ShoppingCartDao dao = new ShoppingCartDaoImpl();

		boolean check = dao.check(user_id, goods_id);

		if (check == true) {
			// System.out.println("该商品已经存在");
			ShoppingCart quary = dao.quary(user_id, goods_id);

			// String jsonString = JSON.toJSONString(quary.getGoods_state());

			if (quary.getGoods_state().equals("1")) {
				response.getWriter().write("add1");

			} else if (quary.getGoods_state().equals("2")) {
				response.getWriter().write("add2");

			} else if (quary.getGoods_state().equals("0")) {
				// System.out.println("add0");
				response.getWriter().write("add0");
			}
		} else {
			ShoppingCart shoppingcart = new ShoppingCart(user_id, goods_id, goods_state, order_num, goods_num);
			dao.insert(shoppingcart);
			response.getWriter().write("add");
		}

		// 0购物车，1已经点了支付但是未支付，2已经支付

	}
}
