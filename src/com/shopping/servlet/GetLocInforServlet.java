package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.daoimpl.UserLocDaoImpl;
import com.shopping.entity.UserLoc;

@WebServlet("/user/page_user/getlocinfor.do")
public class GetLocInforServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("user_id");
		String loc_id = request.getParameter("loc_id");
		// System.out.println(user_id);
		// System.out.println(loc_id);
		UserLocDaoImpl dao = new UserLocDaoImpl();
		if (user_id == "") {
			response.getWriter().write("user_id_is_null");
		} else if (loc_id == "") {
			response.getWriter().write("loc_id_is_null");
		} else {
			UserLoc query = dao.query(user_id, loc_id);
			String jsonString = JSON.toJSONString(query);

			// System.out.println(jsonString);
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(jsonString);
		}

	}

}
