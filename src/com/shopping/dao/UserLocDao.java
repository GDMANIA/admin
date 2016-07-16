package com.shopping.dao;

import java.util.List;

import com.shopping.entity.UserLoc;

public interface UserLocDao {

	public void add(UserLoc userloc);

	public void update(UserLoc userloc);

	public UserLoc query(String user_id, String loc_id);

	public UserLoc select(String user_id);
	

	public List<UserLoc> getShoppingCart(String user_id);
}