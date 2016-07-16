package com.admin.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.daoimpl.UserDaoImpl;
import com.shopping.entity.User;

@WebServlet("/admin/ready.do")
public class userfindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		List<User> user = userDaoImpl.findAll();
		String jsonString = JSON.toJSONString(user);
		System.out.println(jsonString);
		
		response.getWriter().write(jsonString);
		
	}

}
