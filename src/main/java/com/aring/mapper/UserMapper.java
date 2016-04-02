package com.aring.mapper;

import com.aring.bean.User;

public interface UserMapper {

	public int add(User user);
	
	public User selectByName(String name);
	
	public User selectById(int id);
}
