package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.daoimpl.UserDaoImpl;

@WebServlet("/user/page_user/changeUserHead.do")
public class ChangeUserHead extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest requset,
			HttpServletResponse respose) throws ServletException, IOException {
		String user_id = requset.getParameter("user_id");
		String user_head = requset.getParameter("user_head");
		UserDaoImpl dao = new UserDaoImpl();
		dao.changeUserHead(user_id, user_head);
		respose.getWriter().write("success");

	}

}
