package com.admin.servlet;

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

@WebServlet("/admin/goods.do")
public class GoodsOperateServlet extends HttpServlet{

	private static final long serialVersionUID = -3671579933219512377L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		GoodsDao goodsImpl = new GoodsDaoImpl();
		List<Goods> goods = goodsImpl.findAll();
		String jsonString = JSON.toJSONString(goods);
		System.out.println(jsonString);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);
	}
}
