package com.itheima.crm.pojo;

public class User {
	private int age;
	private String name;
	private int passsword;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPasssword() {
		return passsword;
	}
	public void setPasssword(int passsword) {
		this.passsword = passsword;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int age, String name, int passsword) {
		super();
		this.age = age;
		this.name = name;
		this.passsword = passsword;
	}
	

}
