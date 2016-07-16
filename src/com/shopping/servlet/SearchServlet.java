package com.shopping.servlet;

import java.io.IOException;
import java.net.URLEncoder;
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

@WebServlet("/user/page_goods/search.do")
public class SearchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String goods_name = request.getParameter("goods_name");
		System.out.println(goods_name.toString());
		GoodsDao dao = new GoodsDaoImpl();
		List<Goods> search = dao.search(goods_name);

		String jsonString = JSON.toJSONString(search);
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort()
				+ request.getServletContext().getContextPath() + "/";
		System.out.println(jsonString);
		response.setCharacterEncoding("UTF-8");

		response.getWriter().write(jsonString);

	}

}
