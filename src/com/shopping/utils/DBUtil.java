package com.shopping.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	// �������Ӳ�������
	private static String driver = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	private static Properties pp = null;

	// ��̬������ж�ȡ�����ļ��������Ӳ���������ֵ
	static {
		InputStream is = DBUtil.class.getClassLoader().getResourceAsStream(
				"mysql.properties");
		pp = new Properties();
		try {
			pp.load(is);
			driver = pp.getProperty("driver");
			url = pp.getProperty("url");
			username = pp.getProperty("username");
			password = pp.getProperty("password");

			// ʹ�÷������ ����jdbc����
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���ݿ�����
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * �ͷ�����
	 */
	public static void release(ResultSet rs, PreparedStatement ps,
			Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
