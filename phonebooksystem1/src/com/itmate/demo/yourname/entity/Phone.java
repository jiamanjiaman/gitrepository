package com.itmate.demo.yourname.entity;

/**
 * 电话本实体 用于存储联系人信息
 * @author javazhang
 *
 */
public class Phone {
	/** id.**/
	private int id;
	/** 联系人姓名.**/
	private String phoneName;
	/** 联系人电话.**/
	private String phoneNumber;
	/** 联系人性别 1男 0女.**/
	private int phoneGander;
	/** 联系人QQ.**/
	private String phoneQQ;
	
	/**
	 * 带参构造方法
	 * @param id
	 * @param phoneName
	 * @param phoneNumber
	 * @param phoneGander
	 * @param phoneQQ
	 */
	public Phone(int id, String phoneName, String phoneNumber, int phoneGander, String phoneQQ) {
		super();
		this.id = id;
		this.phoneName = phoneName;
		this.phoneNumber = phoneNumber;
		this.phoneGander = phoneGander;
		this.phoneQQ = phoneQQ;
	}
	/**
	 * 无参构造方法
	 */
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneGander() {
		return phoneGander;
	}
	public void setPhoneGander(int phoneGander) {
		this.phoneGander = phoneGander;
	}
	public String getPhoneQQ() {
		return phoneQQ;
	}
	public void setPhoneQQ(String phoneQQ) {
		this.phoneQQ = phoneQQ;
	}
	

}
