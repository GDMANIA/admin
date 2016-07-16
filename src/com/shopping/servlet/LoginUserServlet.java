package com.shopping.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.dao.UserDao;
import com.shopping.daoimpl.UserDaoImpl;
import com.shopping.entity.User;
import com.shopping.utils.MD5Util;

@WebServlet("/user/page_user/login.do")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String user_name = request.getParameter("user_name");
		String user_password = request.getParameter("user_password");
		User user = new User();

		UserDao dao = new UserDaoImpl();

		User login = dao.login(user_name, MD5Util.getMD5(user_password));
		boolean f = login.getUser_id().isEmpty();
		System.out.println(f);

		//
//		String user_logintime = null;
//		Date date = new Date();
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//		user_logintime = sf.format(date);
//
//		dao.updateLoginTime(user_name, user_logintime);

		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort()
				+ request.getServletContext().getContextPath() + "/";

		if (!f && !user_name.isEmpty() && !user_password.isEmpty()) {

			// 创建Cookie对象
			Cookie cookie = new Cookie("user_id", login.getUser_id());
			// 设置声明周期
			cookie.setMaxAge(3600);
			// 将Cookie对象绑定到响应对象上
			cookie.setPath("/");
			response.addCookie(cookie);
			request.getSession().setAttribute("user_id", login.getUser_id());

			response.sendRedirect(basePath + "user/page_user/center.html");
		} else {
			response.sendRedirect(basePath + "user/page_user/login.html");
		}

	}

}
