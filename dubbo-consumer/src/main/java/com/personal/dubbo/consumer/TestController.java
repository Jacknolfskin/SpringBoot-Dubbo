package com.personal.dubbo.consumer;

import com.personal.dubbo.provider.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.alibaba.fastjson.JSONObject;

import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody; 

/**
 * 测试用的 Controller 类；
 */
@Controller
public class TestController {
	
	@Autowired
	private DemoService demoService;

	/**
	 * 测试 JSON 接口；
	 * @param name 名字
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/test/{name}")
	public JSONObject testJson(@PathVariable("name") String name) {
		JSONObject jsonObject = new JSONObject();
		String testStr = demoService.sayHello(name);
		jsonObject.put("str", testStr);
		return jsonObject;
	}
}