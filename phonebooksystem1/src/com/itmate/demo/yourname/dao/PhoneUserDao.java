package com.itmate.demo.yourname.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itmate.demo.yourname.db.DBUtil;
import com.itmate.demo.yourname.entity.PhoneUser;

/**
 * phone_user dao类
 * @author javazhang
 *
 */
public class PhoneUserDao extends BaseDao{

	
	
	/**
	 * 添加用户
	 * @param pu
	 * @return 返回修改数据库条数 0 失败 1成功
	 */
	public int addPhoneUser(PhoneUser pu){

			int count = 0;
		 try {
			connection = DBUtil.getConnection();
			String sql = "insert into phoneuser(pname,phone,age) values(?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, pu.getUsername());
			preparedStatement.setString(2, pu.getPhone());
			preparedStatement.setString(3, pu.getAge());
			count = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closed();
		}
		return count;
	}
	
	/**
	 * 判断用户名密码对应的数据是否存在

	 * @param pu
	 * @return 返回 true 存在， false不存在
	 */
	public boolean isExist(PhoneUser pu){

		boolean flag = false;
		 try {
			 	int count = 0;
				connection = DBUtil.getConnection();
				String sql = "select count(*) as count from phoneuser where pname=? and phone=? and age=?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, pu.getUsername());
				preparedStatement.setString(2, pu.getPhone());
				preparedStatement.setString(3, pu.getAge());
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()){
					//如果可以查找到id那么就说明该数据存在
					count = resultSet.getInt("count");
				}
				if (count != 0 ){
					flag = true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				closed();
			}
		 return flag;
	}
	
	/**
	 * 查询所有用户
	 * @param phone 
	 * @param username 
	 * @param age 
	 * @return
	 */
	public List<PhoneUser> selectAllUser(){
		List<PhoneUser> phoneUserlist = new ArrayList<>();
		try {
		 	
			connection = DBUtil.getConnection();
			String sql = "select * from phoneuser";
			statement = connection.createStatement();
			resultSet =statement.executeQuery(sql);
			while(resultSet.next()){
				PhoneUser pu = new PhoneUser();
				pu.setId(resultSet.getInt("id"));
				pu.setUsername(resultSet.getString("pname"));
				pu.setPhone(resultSet.getString("phone"));
				pu.setAge(resultSet.getString("age"));
				phoneUserlist.add(pu);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closed();
		}
		return phoneUserlist;
	}
	/**
	 *删除数据
	 */
	public int deletebyid(int id){
		int i=-1;
		connection =DBUtil.getConnection();
		String sql = "delete from phoneuser where id=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			i=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closed();
		}
		return i;
		
		}
	public int updatephoneuser(PhoneUser pu){
		connection =DBUtil.getConnection();
		String sql = "update phoneuser set pname=?,phone=?,age=? where id=?";
		int i=-1;
		try { 
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,pu.getUsername());
			preparedStatement.setString(2,pu.getPhone());
			preparedStatement.setString(3, pu.getAge());
			preparedStatement.setInt(4, pu.getId());
			i=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	public List<PhoneUser> selectpubname(String name ){
		List<PhoneUser> list=new ArrayList<>();
		connection =DBUtil.getConnection();
		String sql = "select * from phoneuser where pname like ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "%"+name+"%");
			resultSet=preparedStatement.executeQuery();//resultSet用来储存从数据库中搜索出来的几数据条
			while(resultSet.next()){
				PhoneUser pu=new PhoneUser("pname","phone","age");
				int id=resultSet.getInt("id");
				pu.setId(id);
				pu.setAge(resultSet.getString("age"));
				pu.setPhone(resultSet.getString("phone"));
				list.add(pu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closed();
		}
		return list;
		
	}

}
