package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.shopping.dao.CollectDao;
import com.shopping.entity.Collect;
import com.shopping.utils.DBUtil;

public class CollectDaoImpl implements CollectDao {

	@Override
	public void insert(Collect collect) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "INSERT INTO t_collect(collect_id,user_id,goods_id) VALUES (?,?,?)";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, collect.getCollect_id());
			ps.setString(2, collect.getUser_id());
			ps.setString(3, collect.getGoods_id());
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
	public List<Collect> getCollect(String user_id, String goods_id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean check(String user_id, String goods_id) {
		boolean result = false;
		Collect collect = new Collect();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  collect_id from t_collect where user_id= ? and goods_id=?";
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
}
