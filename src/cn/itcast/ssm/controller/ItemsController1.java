package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.ssm.po.Items;

public class ItemsController1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		List<Items> itemsList=new ArrayList<Items>();
		Items items_1=new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000);
		items_1.setDetail("这是联想笔记本");	
		
		Items items_2=new Items();
		items_2.setName("苹果笔记本");
		items_2.setPrice(5000);
		items_2.setDetail("这是苹果笔记本");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		//返回ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		//相当于request的setAttribut,在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList",itemsList);
		
		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");		
		
		return modelAndView;
	}

}
