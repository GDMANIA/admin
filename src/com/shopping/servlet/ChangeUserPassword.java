package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.daoimpl.UserDaoImpl;
import com.shopping.utils.MD5Util;

@WebServlet("/user/page_user/changeUserPassword.do")
public class ChangeUserPassword extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest requset,
			HttpServletResponse respose) throws ServletException, IOException {
		String user_id = requset.getParameter("user_id");
		String user_password = requset.getParameter("user_password");
		UserDaoImpl dao = new UserDaoImpl();
		dao.changeUserPassword(user_id, MD5Util.getMD5(user_password));
		respose.getWriter().write("success");
		

	}

}
