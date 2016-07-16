package com.shopping.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/user/page_user/login.do")
public class RegisterVerifyCodeFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 强制转型为子类型
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort()
				+ request.getServletContext().getContextPath() + "/";

		// 这里编写对请求对象中的数据进行过滤
		HttpSession session = req.getSession();
		String verifyCode_session = (String) session
				.getAttribute("verifyCode_session");
		String verifyCode = req.getParameter("user_verifyCode");
	
		if (!verifyCode_session.equalsIgnoreCase(verifyCode)) {
			resp.sendRedirect(basePath + "user/page_user/login.html");
			return;
		} else {
			chain.doFilter(request, response); // 继续调用下一个web组件
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
