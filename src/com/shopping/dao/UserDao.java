package com.shopping.dao;

import java.util.List;

import com.shopping.entity.User;

public interface UserDao {
	public void add(User user);

	public User login(String user_name, String user_password);

	public boolean checkUser(String user_name);

	public User load(String User_name);

	public User getUserInfor(String User_id);

	public void updateLoginTime(String user_name, String user_logintime);

	public void changeUserHead(String user_id, String user_head);

	public void changeUserPassword(String user_id, String user_password);
	public void changeUserPhonenum(String user_id, String user_phonenum);
	 
	public List<User> findAll();

}
