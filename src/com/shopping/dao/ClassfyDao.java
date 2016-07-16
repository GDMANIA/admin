package com.shopping.dao;

import java.util.List;

import com.shopping.entity.Classfy;

public interface ClassfyDao {
	public List<Classfy> showAllKeyPoint(int classfy_id);
	public List<Classfy> showAllKeyPoint2();
	public List<Classfy> showAllKeyPoint();
	
	public boolean addClassfy( String classfy_name );
	
	public boolean addsecondClassfy( String classfy_name, String keypoint_name);

}
