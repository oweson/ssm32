package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface UserCustomerDao {
	//1查询符合条件的总条数
		public Integer customerCountByQueryVo(QueryVo vo);
		//2结果集
		public List<Customer> selectCustomerListByQueryVo(QueryVo vo);

}
