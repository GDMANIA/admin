package com.shopping.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.daoimpl.UserLocDaoImpl;
import com.shopping.entity.UserLoc;

@WebServlet("/user/page_cart/showcartloc.do")
public class ShowCartLoc extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		//System.out.println(user_id);
		UserLocDaoImpl dao = new UserLocDaoImpl();
		List<UserLoc> userloc = dao.getShoppingCart(user_id);
		String jsonString = JSON.toJSONString(userloc);
		//System.out.println(jsonString);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);
	}

}
