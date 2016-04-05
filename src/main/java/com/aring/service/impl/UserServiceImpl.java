package com.aring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aring.bean.User;
import com.aring.bean.vo.UserVo;
import com.aring.mapper.UserMapper;
import com.aring.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public UserVo login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVo getUserInfo(int id) {
		User user = userMapper.selectById(id);
		UserVo userVo = new UserVo(user);
		return userVo;
	}

}
