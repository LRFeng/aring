package com.aring.bean.vo;

import com.aring.bean.User;

public class UserVo {
	
	public UserVo(User user) {
		this.id =user.getId();
		this.name = user.getName();
	}
	
	public UserVo() {
		// TODO Auto-generated constructor stub
	}
	
	
	private int id;
	private String name;
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
	
	
	
}
