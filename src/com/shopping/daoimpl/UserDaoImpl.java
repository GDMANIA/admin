package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dao.UserDao;
import com.shopping.entity.User;
import com.shopping.entity.UserLoc;
import com.shopping.utils.DBUtil;
import com.shopping.utils.DateUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void add(User user) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into t_user(user_id ,user_name ,user_password ,user_regtime ,user_logintime ) values (?,?,?,?,?) ";
		conn = DBUtil.getConnection();
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUser_id());
			ps.setString(2, user.getUser_name());

			ps.setString(3, user.getUser_password());
			ps.setDate(4, new Date(user.getUser_regtime().getTime()));
			ps.setDate(5, new Date(user.getUser_logintime().getTime()));
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

	public User login(String user_name, String user_password) {
		User user = new User();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from t_user where user_name=? and user_password =? ";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, user_password);

			rs = ps.executeQuery();

			if (rs.next()) {
				user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getDate(6), rs.getDate(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}
		return user;
	}

	// 校验用户名是否被使用
	@Override
	public boolean checkUser(String user_name) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select user_id from t_user where user_name=?  ";
		conn = DBUtil.getConnection();
		boolean result = false;
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_name);
			rs = ps.executeQuery();

			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return result;
	}

	@Override
	public User load(String User_name) {

		return null;
	}

	@Override
	public User getUserInfor(String User_id) {

		User user = new User();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from t_user where User_id=?  ";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, User_id);

			rs = ps.executeQuery();

			if (rs.next()) {
				user = new User(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getDate(6), rs.getDate(7));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}
		return user;
	}

	@Override
	public void updateLoginTime(String user_name, String user_logintime) {
		// Connection conn = null;
		// PreparedStatement ps = null;
		// String sql =
		// "update form t_user set user_logintime =? where user_name=? ";
		// conn = DBUtil.getConnection();
		//
		// try {
		// conn.setAutoCommit(false);
		// ps = conn.prepareStatement(sql);
		// ps.setDate(1, (Date) DateUtil.toDate(user_logintime));
		// ps.setString(2, user_name);
		//
		// // System.out.println(user.getUser_name());
		// ps.execute();
		// conn.commit();
		//
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// try {
		// conn.rollback();
		// } catch (SQLException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// e.printStackTrace();
		// } finally {
		// try {
		// conn.setAutoCommit(true);
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// DBUtil.release(null, ps, conn);
		// }
		//
	}

	@Override
	public void changeUserHead(String user_id, String user_head) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update  t_user set user_head =? where user_id=? ";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_head);
			ps.setString(2, user_id);
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
	public void changeUserPassword(String user_id, String user_password) {
	
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update  t_user set user_password =? where user_id=? ";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_password);
			ps.setString(2, user_id);
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
	public void changeUserPhonenum(String user_id, String user_phonenum) {

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update  t_user set user_phonenum =? where user_id=? ";
		conn = DBUtil.getConnection();

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_phonenum);
			ps.setString(2, user_id);
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
	public List<User> findAll() {
		List<User> user = new ArrayList<User>();
		User ul = new User();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from t_user";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			//ps.setString(1, user_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				ul = new User(rs.getString("user_id"),
						rs.getString("user_name"), 
						rs.getString("user_phonenum"),
						rs.getString("user_password"),
						rs.getString("user_head"),
						rs.getDate("user_regtime"), 
						rs.getDate("user_logintime"));
				
				user.add(ul);
			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return user;
		
	}
}
