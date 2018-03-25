package com.itheima.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.mapper.ItemsMapper;

import cn.itheima.pojo.Items;
import cn.itheima.pojo.ItemsExample;
@Service
public class ItemsServiceImpl implements ItemsService {
@Autowired
private ItemsMapper ItemsMapper; 
	@Override
	public List<Items> list() {
		
		//不需要任何的查询条件；
		//withblobs 可以查询包含文本字段的列入detail字段；
		ItemsExample example = new ItemsExample();
		List<Items> list = ItemsMapper.selectByExampleWithBLOBs(example);
		
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Items findUserById(Integer id) {
		Items items=ItemsMapper.selectByPrimaryKey(id);
		// TODO Auto-generated method stub
		return items;
	}
	@Override
	public void updateUserByids(Items items) {
		ItemsMapper.updateByPrimaryKeyWithBLOBs(items);
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delOne(Integer id) {
		ItemsMapper.deleteByPrimaryKey(id);
		// TODO Auto-generated method stub
		
	}

}
