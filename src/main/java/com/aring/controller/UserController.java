package com.aring.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aring.bean.vo.UserVo;
import com.aring.service.UserService;

@Controller
public class UserController extends BaseController{
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="userInfo.do", method=RequestMethod.GET)
	public UserVo userInfo(Integer id){ 
		logger.info("获取用户ID为{}的信息"+id);
		logger.error("aring error log");
		return	userService.getUserInfo(id);	
	}
	
	
}
