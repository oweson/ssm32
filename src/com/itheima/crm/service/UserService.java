package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

public interface UserService {
	public List<BaseDict> findUser(String code);


}
