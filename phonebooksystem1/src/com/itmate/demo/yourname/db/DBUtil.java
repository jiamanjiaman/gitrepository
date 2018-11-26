package com.itmate.demo.yourname.db;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 获取数据库工具类
 * @author javazhang
 *
 */
public class DBUtil {

	/**
	 * 获取数据库连接
	 * @return
	 */
	public static Connection getConnection()
	{
		Connection conn= null;
		String url="jdbc:mysql://127.0.0.1:3306/myphonebook?characterEncoding=utf8";
		String user = "root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
