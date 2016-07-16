package com.shopping.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.CollectDao;
import com.shopping.daoimpl.CollectDaoImpl;
import com.shopping.entity.Collect;
import com.shopping.utils.UUIDUtil;

@WebServlet("/user/page_goods/collect.do")
public class CollectServlet extends HttpServlet {

	private static final long serialVersionUID = 485126991824302574L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String goods_id = request.getParameter("goods_id");
		String user_id = request.getParameter("user_id");
		//System.out.println(goods_id + "------" + user_id);
		CollectDao dao = new CollectDaoImpl();
		Collect collect = new Collect(user_id, goods_id, UUIDUtil.getUUID());

		boolean f = dao.check(user_id, goods_id);

		String jsonString = JSON.toJSONString(f);
		//System.out.println(jsonString);
		if (f) {

			response.getWriter().write(jsonString);

		} else {
			dao.insert(collect);
			response.getWriter().write(jsonString);
		}
	}

}
