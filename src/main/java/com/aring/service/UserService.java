package com.aring.service;

import com.aring.bean.vo.UserVo;

public interface UserService {

	public UserVo login();
	
	
	public UserVo getUserInfo(int id); 
}
