package com.shopping.entity;

import java.io.Serializable;

public class Classfy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int classfy_id;
	private String classfy_name;
	private String keypoint_id;
	private String keypoint_name;
	

	public Classfy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classfy(int classfy_id, String classfy_name, String keypoint_id,
			String keypoint_name) {
		super();
		this.classfy_id = classfy_id;
		this.classfy_name = classfy_name;
		this.keypoint_id = keypoint_id;
		this.keypoint_name = keypoint_name;
	}


	public Classfy(String classfy_name, String keypoint_id, String keypoint_name) {
		super();
		this.classfy_name = classfy_name;
		this.keypoint_id = keypoint_id;
		this.keypoint_name = keypoint_name;
	}

	public Classfy(int classfy_id, String classfy_name) {
		super();
		this.classfy_id = classfy_id;
		this.classfy_name = classfy_name;
	}

	public int getClassfy_id() {
		return classfy_id;
	}

	public void setClassfy_id(int classfy_id) {
		this.classfy_id = classfy_id;
	}

	public String getClassfy_name() {
		return classfy_name;
	}

	public void setClassfy_name(String classfy_name) {
		this.classfy_name = classfy_name;
	}

	public String getKeypoint_id() {
		return keypoint_id;
	}

	public void setKeypoint_id(String keypoint_id) {
		this.keypoint_id = keypoint_id;
	}

	public String getKeypoint_name() {
		return keypoint_name;
	}

	public void setKeypoint_name(String keypoint_name) {
		this.keypoint_name = keypoint_name;
	}
}
