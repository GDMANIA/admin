package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.dao.UserDao;
import com.shopping.daoimpl.UserDaoImpl;

@WebServlet("/user/page_user/check_user_name_is_unique.do")
public class LoginUniqueServlet extends HttpServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = 5504524098061738814L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		String user_name = request.getParameter("user_name");
		
		UserDao dao = new UserDaoImpl();
		boolean f = false;
		f = dao.checkUser(user_name);
		// 验证是否存在
		if (f) {
			response.getWriter().write("exist");
		} else {
			response.getWriter().write("not_exist");
		}
	}
}
