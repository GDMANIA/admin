package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dao.UserLocDao;
import com.shopping.entity.GoodsShopping;
import com.shopping.entity.UserLoc;
import com.shopping.utils.DBUtil;

public class UserLocDaoImpl implements UserLocDao {

	@Override
	public void add(UserLoc userloc) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into user_loc(loc_id,user_id,user_realname,user_phonenum,loc_province,loc_city,loc_area,loc_detail,loc_default ) values (?,?,?,?,?,?,?,?,?) ";
		conn = DBUtil.getConnection();
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, userloc.getLoc_id());
			ps.setString(2, userloc.getUser_id());
			ps.setString(3, userloc.getUser_realname());
			ps.setString(4, userloc.getUser_phonenum());
			ps.setString(5, userloc.getLoc_province());
			ps.setString(6, userloc.getLoc_city());
			ps.setString(7, userloc.getLoc_area());
			ps.setString(8, userloc.getLoc_detail());
			ps.setString(9, userloc.getLoc_default());

			// System.out.println(user.getUser_name());
			ps.execute();
			conn.commit();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
	public void update(UserLoc userloc) {

		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "UPDATE user_loc SET user_id=? AND user_realname=? AND user_phonenum=? AND loc_province=? AND loc_city=? AND loc_area=? AND loc_detail=? AND loc_default=? WHERE loc_id=?";
		conn = DBUtil.getConnection();
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, userloc.getUser_id());
			ps.setString(2, userloc.getUser_realname());
			ps.setString(3, userloc.getUser_phonenum());
			ps.setString(4, userloc.getLoc_province());
			ps.setString(5, userloc.getLoc_city());
			ps.setString(6, userloc.getLoc_area());
			ps.setString(7, userloc.getLoc_detail());
			ps.setString(8, userloc.getLoc_default());
			ps.setString(9, userloc.getLoc_id());

			// System.out.println(user.getUser_name());
			ps.execute();
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public UserLoc select(String user_id) {
		UserLoc userloc = new UserLoc();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from user_loc where user_id= ?";
		conn = DBUtil.getConnection();

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);

			rs = ps.executeQuery();

			if (rs.next()) {

				userloc = new UserLoc(rs.getString("loc_id"),
						rs.getString("user_id"), rs.getString("user_realname"),
						rs.getString(" user_phonenum"),
						rs.getString("loc_province"), rs.getString("loc_city"),
						rs.getString("loc_area"), rs.getString("loc_detail"),
						rs.getString("loc_default"));
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return userloc;
	}

	@Override
	public List<UserLoc> getShoppingCart(String user_id) {
		List<UserLoc> userloc = new ArrayList<UserLoc>();
		UserLoc ul = new UserLoc();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from user_loc where user_id= ?";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				ul = new UserLoc(rs.getString("loc_id"),
						rs.getString("user_id"), rs.getString("user_realname"),
						rs.getString("user_phonenum"),
						rs.getString("loc_province"), rs.getString("loc_city"),
						rs.getString("loc_area"), rs.getString("loc_detail"),
						rs.getString("loc_default"));
				userloc.add(ul);
			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return userloc;
	}

	@Override
	public UserLoc query(String user_id, String loc_id) {
		UserLoc userloc = new UserLoc();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from user_loc where user_id= ? and loc_id=?";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, loc_id);

			rs = ps.executeQuery();

			if (rs.next()) {

				userloc = new UserLoc(rs.getString("loc_id"),
						rs.getString("user_id"), rs.getString("user_realname"),
						rs.getString("user_phonenum"),
						rs.getString("loc_province"), rs.getString("loc_city"),
						rs.getString("loc_area"), rs.getString("loc_detail"),
						rs.getString("loc_default"));
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}
		return userloc;
	}
}
