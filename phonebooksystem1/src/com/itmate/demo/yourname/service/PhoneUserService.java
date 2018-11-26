package com.itmate.demo.yourname.service;

import java.util.List;

import com.itmate.demo.yourname.dao.PhoneUserDao;
import com.itmate.demo.yourname.entity.PhoneUser;

/**
 * PhoneUser service类 调用dao类
 * @author javazhang
 *
 */
public class PhoneUserService {

	private PhoneUserDao phoneUserDao = new PhoneUserDao();
	/*
	 * 修改数据
	 */
	public int updatephoneuser(PhoneUser pu){
		
		return phoneUserDao.updatephoneuser(pu);
		
	}
	
	public List<PhoneUser> selectpubname(String name ){
		return phoneUserDao.selectpubname(name);
		
	}
	
	
	
	
	
	
	/*
	 * 删除数据
	 */
	public boolean deletebyid(int id){
		boolean flag =false;
		int i = phoneUserDao.deletebyid(id);
		if(i>0){
			flag=true;
		}
		return flag;
		
		
	}
	/**
	 * 添加用户
	 * @param pu
	 * @return 返回修改数据库条数 0 失败 1成功
	 */
	public int addPhoneUser(PhoneUser pu){
		return phoneUserDao.addPhoneUser(pu);
	}
	
	/**
	 * 判断用户名密码对应的数据是否存在
	 * @param pu
	 * @return 返回 true 存在， false不存在
	 */
	public boolean isExist(PhoneUser pu){
		return phoneUserDao.isExist(pu);
	}
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<PhoneUser> selectAllUser(){
		return phoneUserDao.selectAllUser();
	}
	
}
