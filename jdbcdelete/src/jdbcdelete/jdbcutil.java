package jdbcdelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcutil {
	public static Connection getConnection(){
		Connection conn =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//定义一个url地址，地址的意思是jdbc；数据库软件名；//数据库地址
		//（使用本机的数据库的可以使用127.0.0.1）；端口号/数据库名
		String url="jdbc:mysql://127.0.0.1:3306/school"+"?useUnicode=true&characterEncoding=UTF-8";
		//获取数据库连接，并输入账号和密码；
		try {
			conn=DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeconnection(ResultSet rs ){
		if(rs!= null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
