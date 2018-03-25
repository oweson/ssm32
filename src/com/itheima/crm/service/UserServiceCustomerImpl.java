package com.itheima.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.common.utils.Page;
import com.itheima.crm.mapper.UserCustomerDao;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

/**
 * 
 * 客户管理
 **/
@Service
public class UserServiceCustomerImpl implements UserServiceCustomer {
	@Autowired
	private UserCustomerDao customerDao;
	// 对mapper中的do进行注入；

	public Page<Customer> selectPageByQueryVoSth(QueryVo vo) {

		// 1.设置分页对象；
		Page<Customer> page = new Page<Customer>();
		// 2vo中有所需要的东西；
		// page.setPage(vo.getSize());
		page.setSize(5);
		vo.setSize(5);
		// 3每一页显示5；

		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() - 1) * vo.getSize());
			}
			if (null != vo.getCustName() && !"".equals(vo.getCustName().trim())) {
				vo.setCustName(vo.getCustName().trim());
			}
			if (null != vo.getCustSource() && !"".equals(vo.getCustSource().trim())) {
				vo.setCustSource(vo.getCustSource().trim());
			}
			if (null != vo.getCustIndustry() && !"".equals(vo.getCustIndustry().trim())) {
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
			if (null != vo.getCustLevel() && !"".equals(vo.getCustLevel().trim())) {
				vo.setCustLevel(vo.getCustLevel().trim());
			}
			page.setTotal(customerDao.customerCountByQueryVo(vo));
			// 通过查询得到中的条数；进行设置；

			// 设置中的条数；
			page.setRows(customerDao.selectCustomerListByQueryVo(vo));
			// 查询符合条件的结果集合；

		}

		return page;
	}
	/*
	 * public Page<Customer> selectPageByQueryVoSth(QueryVo vo) { Page<Customer>
	 * page = new Page<Customer>(); //每页数 page.setSize(5); vo.setSize(5); if
	 * (null != vo) { // 判断当前页 if (null != vo.getPage()) {
	 * page.setPage(vo.getPage()); vo.setStartRow((vo.getPage()
	 * -1)*vo.getSize()); } if(null != vo.getCustName() &&
	 * !"".equals(vo.getCustName().trim())){
	 * vo.setCustName(vo.getCustName().trim()); } if(null != vo.getCustSource()
	 * && !"".equals(vo.getCustSource().trim())){
	 * vo.setCustSource(vo.getCustSource().trim()); } if(null !=
	 * vo.getCustIndustry() && !"".equals(vo.getCustIndustry().trim())){
	 * vo.setCustIndustry(vo.getCustIndustry().trim()); } if(null !=
	 * vo.getCustLevel() && !"".equals(vo.getCustLevel().trim())){
	 * vo.setCustLevel(vo.getCustLevel().trim()); } //总条数
	 * page.setTotal(customerDao.customerCountByQueryVo(vo));
	 * page.setRows(customerDao.selectCustomerListByQueryVo(vo)); } return page;
	 * 
	 * }
	 */

}
