package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dao.ClassfyDao;
import com.shopping.entity.Classfy;
import com.shopping.entity.Floor;
import com.shopping.utils.DBUtil;

public class ClassfyDaoImpl implements ClassfyDao {

	@Override
	public List<Classfy> showAllKeyPoint(int classfy_id) {
		List<Classfy> clsaafy = new ArrayList<Classfy>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_classfy WHERE classfy_id=?";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, classfy_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				clsaafy.add(new Classfy(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return clsaafy;
	}

	@Override
	public List<Classfy> showAllKeyPoint() {
		// TODO Auto-generated method stub
		List<Classfy> clsaafy = new ArrayList<Classfy>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM first_floor ";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			//ps.setInt(1, classfy_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				clsaafy.add(new Classfy(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return clsaafy;
	}

	@Override
	public boolean addClassfy(String classfy_name ) {
		boolean f = false ;
		Connection conn = null;
		PreparedStatement ps = null;
		//ResultSet rs = null
		String sql = "INSERT INTO first_floor(classfy_name) VALUES (?) ";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, classfy_name);
			//rs = ps.executeUpdate();
			ps.execute();
			//conn.commit();
			f= true ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(null, ps, conn);
		}

		return f;
	}

	@Override
	public List<Classfy> showAllKeyPoint2() {
		List<Classfy> clsaafy = new ArrayList<Classfy>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_classfy";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			//ps.setInt(1, classfy_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				clsaafy.add(new Classfy(rs.getString(1),rs.getString(2),  rs
						.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return clsaafy;
	}

	@Override
	public boolean addsecondClassfy(String classfy_name, String keypoint_name) {
		boolean f = false ;
		Connection conn = null;
		PreparedStatement ps = null;
		//ResultSet rs = null
		String sql = "INSERT INTO t_classfy (classfy_name, keypoint_name) VALUES (?, ?) ";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, classfy_name);
			ps.setString(2, keypoint_name);

			//rs = ps.executeUpdate();
			ps.execute();
			//conn.commit();
			f= true ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(null, ps, conn);
		}

		return f;
	}

}
