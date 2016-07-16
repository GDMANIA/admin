package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.dao.ShoppingCartDao;
import com.shopping.daoimpl.ShoppingCartDaoImpl;

@WebServlet("/user/page_cart/deleteshoppingcartgoods.do")
public class DeleteShoppingCartGoodsSerlvet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		String goods_id = request.getParameter("goods_id");
		// System.out.println(user_id);
		 //System.out.println(goods_id);
		ShoppingCartDao dao = new ShoppingCartDaoImpl();
		dao.delete(user_id, goods_id);
		response.getWriter().write("success");

	}

}
