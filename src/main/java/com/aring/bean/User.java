package com.aring.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	private int id;
	@NotEmpty(message="姓名不能为空")
	private String name;
	@NotEmpty(message="密码不能为空")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
