package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSON;

import com.shopping.dao.GoodsDao;
import com.shopping.daoimpl.GoodsDaoImpl;
import com.shopping.entity.Goods;

@WebServlet("/user/page_goods/showgoods.do")

public class ShowGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request.setCharacterEncoding("UTF_8");
		// System.out.println();
		String goods_id = request.getParameter("goods_id");

		// System.out.println(goods_id);
		GoodsDao goodsdao = new GoodsDaoImpl();
		Goods select = goodsdao.select(goods_id);
		String jsonString = JSON.toJSONString(select);
		// System.out.println(jsonString);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);
	}

}
