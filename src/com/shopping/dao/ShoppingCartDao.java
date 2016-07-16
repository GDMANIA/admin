package com.shopping.dao;

import java.util.List;

import com.shopping.entity.ShoppingCart;

public interface ShoppingCartDao {

	public void insert(ShoppingCart shoppingcart);

	public ShoppingCart quary(String user_id, String goods_id);

	public boolean check(String user_id, String goods_id);

	public List<ShoppingCart> getShoppingCart(String user_id);

	public void delete(String user_id, String goods_id);
}
