package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.daoimpl.UserDaoImpl;

@WebServlet("/user/page_user/changephonenum.do")
public class ChangeUserPhoneNum extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest requset,
			HttpServletResponse respose) throws ServletException, IOException {
		String user_id = requset.getParameter("user_id");
		String user_phonenum = requset.getParameter("user_phonenum");
		// System.out.println(user_phonenum);
		UserDaoImpl dao = new UserDaoImpl();
		dao.changeUserPhonenum(user_id, user_phonenum);
		respose.getWriter().write("success");
		

	}

}
