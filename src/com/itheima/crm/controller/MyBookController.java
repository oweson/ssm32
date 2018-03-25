package com.itheima.crm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.itheima.crm.pojo.User;

@SuppressWarnings("unused")
@Controller
@RequestMapping(value = "/selffish")
public class MyBookController {
	private static List<User> userList;
	public MyBookController(){
		userList = new ArrayList<User>();
	}
	private static final Log Logger = LogFactory.getLog(MyBookController.class);

	// 得到励志对象；
	@RequestMapping(value = "/fish")
	public String registerForm() {

		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register() {
		return null;
		/*@RequestParam("name") String name,
		@RequestParam(age) int age,
		@RequestParam(password) int password,
		return null;*/
		

	}

}
