package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.UserDao;
import com.shopping.daoimpl.UserDaoImpl;
import com.shopping.entity.User;

@WebServlet("/user/page_user/showuserinfor.do")
public class ShowUserInfor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		// System.out.println(user_id);
		UserDao dao = new UserDaoImpl();
		User user = dao.getUserInfor(user_id);
		String jsonString = JSON.toJSONString(user);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);
		 //System.out.println(jsonString);

	}

}
