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
		//����һ��url��ַ����ַ����˼��jdbc�����ݿ��������//���ݿ��ַ
		//��ʹ�ñ��������ݿ�Ŀ���ʹ��127.0.0.1�����˿ں�/���ݿ���
		String url="jdbc:mysql://127.0.0.1:3306/school"+"?useUnicode=true&characterEncoding=UTF-8";
		//��ȡ���ݿ����ӣ��������˺ź����룻
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
