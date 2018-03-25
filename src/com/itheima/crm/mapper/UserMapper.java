package com.itheima.crm.mapper;

import com.itheima.crm.pojo.User;

public interface UserMapper {
	// 自己定义的根据名字进行查询
	User findByUser(String username);

	// 自己定义的根据进行注册；
	int addUser(User model);

	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}