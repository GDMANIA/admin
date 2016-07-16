package com.shopping.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.ClassfyDao;
import com.shopping.daoimpl.ClassfyDaoImpl;
import com.shopping.entity.Classfy;

@WebServlet("/admin/ShowClassfy_second.do")
public class ShowClassfy_second extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//int classfy_id = Integer.parseInt(request.getParameter("classfy_id"));
		//classfy_id = 1;
		ClassfyDao dao = new ClassfyDaoImpl();
		List<Classfy> showAllKeyPoint = dao.showAllKeyPoint2();
		String jsonString = JSON.toJSONString(showAllKeyPoint);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);
	}
}
