package com.itheima.crm.service;

import com.itheima.common.utils.Page;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface UserServiceCustomer {
	public Page<Customer> selectPageByQueryVoSth(QueryVo vo);
	// 通过四个条件 查询分页对象
	//public Page<Customer> selectSthByQueryVo(QueryVo vo);

}
