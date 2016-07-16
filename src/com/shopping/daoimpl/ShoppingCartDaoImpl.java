package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.shopping.dao.ShoppingCartDao;
import com.shopping.entity.Collect;
import com.shopping.entity.ShoppingCart;
import com.shopping.utils.DBUtil;

public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Override
	public void insert(ShoppingCart shoppingcart) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "INSERT INTO t_shoppingcart(user_id,goods_id,goods_state,goods_num) VALUES (?,?,?,?)";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, shoppingcart.getUser_id());
			ps.setString(2, shoppingcart.getGoods_id());
			ps.setString(3, shoppingcart.getGoods_state());
			ps.setInt(4, shoppingcart.getGoods_num());
			ps.execute();
			conn.commit();

		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBUtil.release(null, ps, conn);
		}

	}

	@Override
	public ShoppingCart quary(String user_id, String goods_id) {

		// boolean result = false;
		ShoppingCart shoppingcart = new ShoppingCart();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from t_shoppingcart where user_id= ? and goods_id=?";
		conn = DBUtil.getConnection();

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, goods_id);
			rs = ps.executeQuery();

			if (rs.next()) {

				shoppingcart = new ShoppingCart(user_id, goods_id,
						rs.getString("goods_state"), rs.getString("order_num"),
						rs.getInt("goods_num"));
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return shoppingcart;
	}

	@Override
	public List<ShoppingCart> getShoppingCart(String user_id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean check(String user_id, String goods_id) {
		boolean result = false;

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from t_shoppingcart where user_id= ? and goods_id=?";
		conn = DBUtil.getConnection();

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, goods_id);
			rs = ps.executeQuery();

			if (rs.next()) {

				result = true;
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return result;
	}

	@Override
	public void delete(String user_id, String goods_id) {
		ShoppingCart shoppingcart = new ShoppingCart();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "delete from t_shoppingcart  where user_id= ? and goods_id=? ";
		conn = DBUtil.getConnection();
		System.out.println(user_id);
		System.out.println(goods_id);
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, goods_id);
			ps.execute();
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBUtil.release(null, ps, conn);
		}

	}

}
