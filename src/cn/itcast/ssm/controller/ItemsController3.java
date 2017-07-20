package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

/**
 * ע�⿪��Handler
 */

// ʹ��Controller��ʶ����һ��������
@Controller
public class ItemsController3 {

	//��Ʒ��ѯ�б�
	//@RequestMappingʵ�ֶ�queryItems������url����ӳ�䣬һ��������Ӧһ��url
	//һ�㽨�齫url�ͷ���д��һ��
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {

		List<Items> itemsList = new ArrayList<Items>();
		Items items_1 = new Items();
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000);
		items_1.setDetail("��������ʼǱ�11");

		Items items_2 = new Items();
		items_2.setName("ƻ���ʼǱ�");
		items_2.setPrice(5000);
		items_2.setDetail("����ƻ���ʼǱ�");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// �൱��request��setAttribut,��jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemsList", itemsList);
		
		// ָ����ͼ
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

		return modelAndView;

	}

}
