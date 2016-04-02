package com.aring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aring.bean.vo.UserVo;
import com.aring.service.UserService;

@Controller
public class UserController extends BaseController{
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="userInfo.do", method=RequestMethod.GET)
	public UserVo userInfo(Integer id){ 
		return	userService.getUserInfo(id);	
	}
	
	
}
