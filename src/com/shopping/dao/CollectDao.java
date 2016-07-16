package com.shopping.dao;

import java.util.List;

import com.shopping.entity.Collect;


public interface CollectDao {

	public void insert(Collect collect);
	public boolean  check(String user_id, String goods_id);

	public List<Collect> getCollect(String user_id, String goods_id);
}
