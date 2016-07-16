package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dao.FloorDao;
import com.shopping.entity.Floor;
import com.shopping.utils.DBUtil;

public class FloorDaoImpl implements FloorDao {

	@Override
	public List<Floor> showAllGoods(int floor_id) {
		List<Floor> floors = new ArrayList<Floor>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT floor_id,goods_id FROM t_floor WHERE floor_id=?";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, floor_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				floors.add(new Floor(rs.getInt("floor_id"), rs
						.getString("goods_id")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return floors;

	}


}
