package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

@WebServlet("/user/page_user/getsession.do")
public class AjaxGetSessionSeervlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String jsonString = JSON.toJSONString(request.getSession()
				.getAttribute("user"));
		System.out.println(jsonString);
		response.getWriter().write(jsonString);

	}

}
