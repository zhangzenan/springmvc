package cn.itcast.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.itcast.ssm.po.Items;

public class ItemsController2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
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
		
		//设置模型数据
		arg0.setAttribute("itemsList", itemsList); 
		
		//设置转发的视图
		arg0.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(arg0, arg1);
		
	}





}
