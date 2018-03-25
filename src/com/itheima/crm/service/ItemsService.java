package com.itheima.crm.service;

import cn.itheima.pojo.*;

import java.util.List;

import cn.itheima.pojo.Items;

@SuppressWarnings("unused")
public interface ItemsService {
	public List<Items> list();

	public Items findUserById(Integer id);
//进行更新；
	public void updateUserByids(Items items);
	public void delOne(Integer id);
}
