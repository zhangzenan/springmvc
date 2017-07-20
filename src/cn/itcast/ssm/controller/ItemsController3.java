package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

/**
 * 注解开发Handler
 */

// 使用Controller标识它是一个控制器
@Controller
public class ItemsController3 {

	//商品查询列表
	//@RequestMapping实现对queryItems方法和url进行映射，一个方法对应一个url
	//一般建议将url和方法写成一样
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {

		List<Items> itemsList = new ArrayList<Items>();
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000);
		items_1.setDetail("这是联想笔记本11");

		Items items_2 = new Items();
		items_2.setName("苹果笔记本");
		items_2.setPrice(5000);
		items_2.setDetail("这是苹果笔记本");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribut,在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		// 指定视图
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

		return modelAndView;

	}

}
