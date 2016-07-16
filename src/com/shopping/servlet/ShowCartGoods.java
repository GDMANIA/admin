package com.shopping.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.GoodsDao;
import com.shopping.daoimpl.GoodsDaoImpl;
import com.shopping.entity.Goods;
import com.shopping.entity.GoodsShopping;

@WebServlet("/user/page_cart/showcartgoods.do")
public class ShowCartGoods extends HttpServlet {

	private static final long serialVersionUID = 3303552127560053805L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		// System.out.println(user_id);
		GoodsDao dao = new GoodsDaoImpl();
		List<GoodsShopping> showCart = dao.showCart(user_id);
		// List<Goods> showCart = dao.showCart(user_id);

		String jsonString = JSON.toJSONString(showCart);
		//System.out.println(jsonString);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);

	}

}
