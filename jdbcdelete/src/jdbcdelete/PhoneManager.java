package jdbcdelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneManager {
private Connection conn;//数据库链接对象
	
	PreparedStatement pstmt;
	public PhoneManager(){
		conn=jdbcutil.getConnection();//获取数据库链接
	}
	public int deletePhone(Phone_book b){
		int i=1;//表示我们运行的sql语句影响了多少条数据
		try {
			//创建一个可以运行sql语句的对象
			PreparedStatement pstmt=conn.prepareStatement(
					"delete from phone_book where id<?");
			pstmt.setInt(1, b.getId());
			i=pstmt.executeUpdate();//执行sql语句，并返回执行了多少条数据
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;//把i返回给调用insertPhone()这个方法的对象
		
	}

}
