 package com.itmate.demo.yourname.entity;
/**
 * 用于登陆的实体类
 * @author javazhang
 *
 */
public class PhoneUser {

	/** id.**/
	private int id;
	/** 登录名.**/
	private String username;
	/** 密码.**/
	private String phone;
	
	private String age;
	
	
	
	public PhoneUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 带参构造方法
	 * @param id
	 * @param username
	 * @param phone
	 * age
	 */
	

	public PhoneUser(int id, String username, String phone, String age) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.age = age;
	}

	public PhoneUser(String username, String phone, String age) {
		super();
		this.username = username;
		this.phone = phone;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
}
