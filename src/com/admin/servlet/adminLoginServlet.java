package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.daoimpl.adminimpl;
import com.shopping.entity.Admin;


@WebServlet("/admin/submit.do")
public class adminLoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a_name = request.getParameter("a_name");
		String a_password = request.getParameter("a_password");
		System.out.println(a_name +">>>>>>>>"+a_password);
	//	User login = dao.login(user_name, MD5Util.getMD5(user_password));
	//	boolean f = login.getUser_id().isEmpty();
		//		user_logintime = sf.format(date);
		
		adminimpl admin = new adminimpl();
		admin.login(a_name, a_password);
		
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort()
				+ request.getServletContext().getContextPath() + "/";
		//if (!f && !user_name.isEmpty() && !user_password.isEmpty()) {
			// 创建Cookie对象
		
			Admin ad = new Admin(); 
			Cookie cookie = new Cookie("a_name", a_name);
			// 设置声明周期
			cookie.setMaxAge(3600);
			// 将Cookie对象绑定到响应对象上
			cookie.setPath("/");
			response.addCookie(cookie);
			request.getSession().setAttribute("a_name", a_name);
			//request.setAttribute("a_name", ad.getA_name());
			response.sendRedirect(basePath + "admin/main.jsp");

	}

	
}
