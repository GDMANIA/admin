package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.daoimpl.UserLocDaoImpl;
import com.shopping.entity.UserLoc;
import com.shopping.utils.UUIDUtil;

@WebServlet("/user/page_user/addUserLoc.do")
public class AddUserLocServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loc_id = UUIDUtil.getUUID();
		String user_id = request.getParameter("user_id");
		String user_realname = request.getParameter("user_realname");
		String user_phonenum = request.getParameter("user_phonenum");
		String loc_province = request.getParameter("loc_province");
		String loc_city = request.getParameter("loc_city");
		String loc_area = request.getParameter("loc_area");
		String loc_detail = request.getParameter("loc_detail");
		String loc_default = request.getParameter("loc_default");

		UserLoc userloc = new UserLoc(loc_id, user_id, user_realname, user_phonenum, loc_province, loc_city, loc_area,
				loc_detail, loc_default);
		UserLocDaoImpl dao = new UserLocDaoImpl();

		if (user_id.isEmpty()) {

			response.getWriter().write("false");
		} else {
			dao.add(userloc);
			response.getWriter().write("success");
		}

	}

}
