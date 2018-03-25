package com.itheima.crm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.DeploymentException;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.crm.service.ItemsService;

import cn.itheima.pojo.Items;
import cn.itheima.pojo.QueryVo;

@Controller
public class Ssm_controller {
	@RequestMapping(value = "/ppx")
	public String demo1() {
		return "success";
	}

	@Autowired
	private ItemsService itemsService;

	@RequestMapping(value = "/lists")
	public ModelAndView ItemsList() {
		List<Items> list = itemsService.list();
		ModelAndView andView = new ModelAndView();
		System.out.println(list);
		andView.addObject("itemList", list);
		andView.setViewName("itemList");
		return andView;

	}

	@RequestMapping(value = "/edit")
	public String findUserById(HttpServletRequest request, Model andView) {
		String id = request.getParameter("id");

		Items findUserById = itemsService.findUserById(Integer.parseInt(id));
		// ((ModelAndView) andView).addObject("", findUserById);
		andView.addAttribute("item", findUserById);
		return "editItem";
	}

	@RequestMapping(value = "/demo")
	// @RequestParam("id")
	// 括号的内容雨页面的一样，后面的可以只有的修改；作用不大,d得到后传递给后面的东非；
	public String findById(@RequestParam("id") String ids) {
		return null;

	}

	// 3
	@RequestMapping(value = "/updateitem")
	public String updateitem(Items items, Model model) {
		// items.setCreatetime(new Date());
		model.addAttribute("id", items.getId());
		// 因为转发中需要传入id
		itemsService.updateUserByids(items);
		return "forward:itemEdit.action";
		//加刚就是绝对路径，从项目下查找；
		// 请求转发

		// String name
		// integer id;
		// String detail
		// int count

	}

	@RequestMapping(value = "/search.action")
	public String search(QueryVo vo) {

		System.out.println(vo);
		return "";
	}

	@RequestMapping(value = "/delOne.action")
	public String delOne(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		itemsService.delOne(Integer.parseInt(id));
		return "success";
	}

	// 4
	@RequestMapping(value = "/delAll.action")
	public String delAll(Integer[] ids) {
		System.out.println(ids);
		return "sucess";

	}
	/*
	 * List<Items> list = itmesService.list();
	 * 
	 * ModelAndView modelAndView = new ModelAndView();
	 * 
	 * modelAndView.addObject("itemList", list);
	 * modelAndView.setViewName("itemList");
	 * 
	 * return modelAndView;
	 */

}
