package com.shopping.dao;

import java.util.List;

import com.shopping.entity.Goods;
import com.shopping.entity.GoodsShopping;

public interface GoodsDao {

	public Goods select(String goods_id);

	public List<GoodsShopping> showCart(String user_id);
	public List<Goods> search(String goods_name);
	public List<Goods> findAll();
}
