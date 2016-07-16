package com.shopping.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AccountException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.shopping.dao.FloorDao;
import com.shopping.dao.GoodsDao;
import com.shopping.daoimpl.FloorDaoImpl;
import com.shopping.daoimpl.GoodsDaoImpl;
import com.shopping.entity.Floor;
import com.shopping.entity.Goods;

@WebServlet("/user/page_goods/showfloor.do")
public class ShowFloor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int floor_id = Integer.parseInt(request.getParameter("floor_id"));

		// System.out.println(floor_id);

		FloorDao dao = new FloorDaoImpl();
		List<Floor> showAllGoods = dao.showAllGoods(floor_id);

		List<Goods> goodslist = new ArrayList();
		for (int i = 0; i < showAllGoods.size(); i++) {
			Floor floor = showAllGoods.get(floor_id-1);
			String goods_id = showAllGoods.get(i).getGoods_id();
			GoodsDao goodsDaoImpl = new GoodsDaoImpl();
			Goods select = goodsDaoImpl.select(goods_id);
			goodslist.add(select);

		}
		String jsonString = JSON.toJSONString(goodslist);
		// System.out.println(jsonString);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonString);
	}

}
