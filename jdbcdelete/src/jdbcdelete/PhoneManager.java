package jdbcdelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneManager {
private Connection conn;//���ݿ����Ӷ���
	
	PreparedStatement pstmt;
	public PhoneManager(){
		conn=jdbcutil.getConnection();//��ȡ���ݿ�����
	}
	public int deletePhone(Phone_book b){
		int i=1;//��ʾ�������е�sql���Ӱ���˶���������
		try {
			//����һ����������sql���Ķ���
			PreparedStatement pstmt=conn.prepareStatement(
					"delete from phone_book where id<?");
			pstmt.setInt(1, b.getId());
			i=pstmt.executeUpdate();//ִ��sql��䣬������ִ���˶���������
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;//��i���ظ�����insertPhone()��������Ķ���
		
	}

}
