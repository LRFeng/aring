package com.aring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aring.bean.User;
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
	
	
	/**
	 * 数据校验测试
	 * @param user
	 * @param results
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="validated.do", method=RequestMethod.POST)
	public List<String> validated(@RequestBody @Validated User user,BindingResult results) {
		List<String> list = new ArrayList<String>();
		if(results.hasErrors()){
			for (int i = 0; i < results.getErrorCount(); i++)
	            list.add(results.getAllErrors().get(i).getDefaultMessage());
		}
		if(list.size()<=0) {
			list.add("数据合法");
		}		
		return	list;
	}
	
}
