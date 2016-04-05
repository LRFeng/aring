package com.aring.service;

import com.aring.bean.User;
import com.aring.bean.vo.UserVo;

public interface UserService {

	public UserVo login(User user);
	
	
	public UserVo getUserInfo(int id); 
}
