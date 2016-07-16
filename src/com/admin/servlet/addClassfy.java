package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.ClassfyDao;
import com.shopping.daoimpl.ClassfyDaoImpl;


@WebServlet("/admin/categarysecondadd.do")
public class addClassfy extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("categarysecondadd  is running");
		
		String classfy_name = request.getParameter("classfy_name22");
		System.out.println(classfy_name);
		String keypoint_name = request.getParameter("keypoint_name");

		System.out.println(keypoint_name);
		ClassfyDao dao = new ClassfyDaoImpl();
		if(keypoint_name!=null){
			
			boolean addClassfy = dao.addsecondClassfy(classfy_name,keypoint_name);
			if(addClassfy){
				String jsonString = JSON.toJSONString(addClassfy);
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(jsonString);
				response.sendRedirect("/admin/admin/categorysecond.jsp");
			}
		}else{
			
		}
		
		
	}

	
}
