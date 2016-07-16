package com.shopping.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dao.GoodsDao;
import com.shopping.entity.Floor;
import com.shopping.entity.Goods;
import com.shopping.entity.GoodsShopping;
import com.shopping.entity.User;
import com.shopping.utils.DBUtil;

public class GoodsDaoImpl implements GoodsDao {

	@Override
	public Goods select(String goods_id) {
		Goods goods = new Goods();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_goodsinfo WHERE goods_id=?";
		conn = DBUtil.getConnection();

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, goods_id);

			goods.setGoods_id(goods_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				goods = new Goods(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5),
						rs.getDouble(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}
		return goods;
	}

	@Override
	public List<GoodsShopping> showCart(String user_id) {
		List<GoodsShopping> goods = new ArrayList<GoodsShopping>();
		GoodsShopping gs = new GoodsShopping();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_goodsinfo g,t_shoppingcart s WHERE  g.goods_id=s.goods_id AND user_id= ? AND goods_state='0'";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				gs = new GoodsShopping(rs.getString("g.goods_id"), rs.getString("goods_storename"),
						rs.getString("goods_name"), rs.getString("goods_introduce"), rs.getDouble("goods_formerprice"),
						rs.getDouble("goods_price"), rs.getInt("goods_count"), rs.getInt("goods_salcout"),
						rs.getInt("goods_evaluatcout"), rs.getString("goods_fivepicture"), rs.getString("user_id"),
						rs.getString("goods_state"), rs.getString("order_num"), rs.getInt("goods_num"));
				goods.add(gs);
			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return goods;
	}
	@Override
	public List<Goods> search(String goods_name) {
		List<Goods> goods = new ArrayList<Goods>();
		Goods gs = new Goods();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_goodsinfo WHERE goods_name like ?";
		conn = DBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+goods_name +"%");
			rs = ps.executeQuery();
			while (rs.next()) {
				gs = new Goods(rs.getString("goods_id"),
						rs.getString("goods_storename"),
						rs.getString("goods_name"),
						rs.getString("goods_introduce"),
						rs.getDouble("goods_formerprice"),
						rs.getDouble("goods_price"), rs.getInt("goods_count"),
						rs.getInt("goods_salcout"),
						rs.getInt("goods_evaluatcout"),
						rs.getString("goods_fivepicture"),
						rs.getString("goods_fivepicture1"),
						rs.getString("goods_fivepicture2"),
						rs.getString("goods_fivepicture3"),
						rs.getString("goods_fivepicture4")

						
						);
				goods.add(gs);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return goods;

	}

	@Override
	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		List<Goods> goods = new ArrayList<Goods>();
		Goods gd = new Goods();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select  * from t_goodsinfo";
		conn = DBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			//ps.setString(1, user_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				gd = new Goods(rs.getString("goods_id"),
						rs.getString("goods_storename"), 
						rs.getString("goods_introduce"),
						rs.getDouble("goods_formerprice"),
						rs.getDouble("goods_price"),
						rs.getInt("goods_count"),
						rs.getString("goods_fivepicture"),
						rs.getString("goods_fivepicture1"),
						rs.getString("goods_fivepicture2"),
						rs.getString("goods_fivepicture3"),
						rs.getString("goods_fivepicture4"));
				goods.add(gd);
			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			DBUtil.release(rs, ps, conn);
		}

		return goods;
	}
}
