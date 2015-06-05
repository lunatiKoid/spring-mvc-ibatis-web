package com.leeon.myweb;

import com.leeon.biz.db.module.dataobject.UserDO;
import com.leeon.biz.db.module.service.UserServicesLocator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		UserDO userDO = new UserDO();
		userDO.setId(UserServicesLocator.getUserService().findMaxId()+1);
		userDO.setName("yao");
		userDO.setAge(99);
		UserServicesLocator.getUserService().insertUser(userDO);
		return "hello";
	}
}
