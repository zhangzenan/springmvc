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
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000);
		items_1.setDetail("��������ʼǱ�");
		
		Items items_2=new Items();
		items_2.setName("ƻ���ʼǱ�");
		items_2.setPrice(5000);
		items_2.setDetail("����ƻ���ʼǱ�");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		//����ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		//�൱��request��setAttribut,��jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemsList",itemsList);
		//ָ����ͼ
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");		
		
		return modelAndView;
	}

}
