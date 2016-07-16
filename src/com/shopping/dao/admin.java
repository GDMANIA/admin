package com.shopping.dao;

import com.shopping.entity.Admin;
import com.shopping.entity.User;

public interface admin {

	public void add(Admin user);

	public Admin login(String user_name, String user_password);

	public boolean checkUser(String user_name);

	public User load(String User_name);

	public User getUserInfor(String User_id);

	public void updateLoginTime(String user_name, String user_logintime);

	public void changeUserHead(String user_id, String user_head);

	public void changeUserPassword(String user_id, String user_password);
	public void changeUserPhonenum(String user_id, String user_phonenum);
}
