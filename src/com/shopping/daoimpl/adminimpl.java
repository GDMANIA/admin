package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shopping.dao.admin;
import com.shopping.entity.Admin;
import com.shopping.entity.User;
import com.shopping.utils.DBUtil;

public class adminimpl implements admin {

	@Override
	public void add(Admin user) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into a_user(a_name ,a_password  ) values (?,?) ";
		conn = DBUtil.getConnection();
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getA_name());
			ps.setString(2, user.getA_password());

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
	public Admin login(String a_name, String a_password) {
		// TODO Auto-generated method stub
		Admin admin = new Admin(a_password, a_password);
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from a_user where a_name=? and a_password =? ";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, a_name);
			ps.setString(2, a_password);

			rs = ps.executeQuery();

			if (rs.next()) {
				admin = new Admin(rs.getString(1), rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}
		return admin;
	}

	@Override
	public boolean checkUser(String user_name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User load(String User_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserInfor(String User_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLoginTime(String user_name, String user_logintime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeUserHead(String user_id, String user_head) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeUserPassword(String user_id, String user_password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeUserPhonenum(String user_id, String user_phonenum) {
		// TODO Auto-generated method stub

	}

}
