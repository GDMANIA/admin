package com.shopping.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.dao.UserDao;
import com.shopping.daoimpl.UserDaoImpl;
import com.shopping.entity.User;
import com.shopping.utils.MD5Util;
import com.shopping.utils.UUIDUtil;

@WebServlet("/user/page_user/register.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String user_name = request.getParameter("user_name");
		String user_phonenum = request.getParameter("user_phonenum");
		String user_password = request.getParameter("user_password");
		String user_head = request.getParameter("user_head");
		Date user_regtime = null;
		Date user_logintime = null;

		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String time = sf.format(date);
		try {
			user_regtime = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").parse(time);
			user_logintime = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").parse(time);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		// 封装成对象

		User user = new User(UUIDUtil.getUUID(), user_name, user_phonenum,
				MD5Util.getMD5(user_password), user_head, user_regtime,
				user_logintime);
		// 交给dao层
		UserDao dao = new UserDaoImpl();
		dao.add(user);
		// 转发到一个成功的页面
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort()
				+ request.getServletContext().getContextPath() + "/";

		if (!user_name.isEmpty() && !user_password.isEmpty()) {
			request.getSession().setAttribute("user_name", user_name);
			response.sendRedirect(basePath + "user/page_user/login.html");
		} else {
			response.sendRedirect(basePath + "user/page_user/register.html");
		}

	}
}
