package com.shopping.dao;

import java.util.List;

import com.shopping.entity.Floor;

public interface FloorDao {
	//public Floor showAllGoods(String floor_id);
	
	public List<Floor> showAllGoods(int floor_id);
	
}
