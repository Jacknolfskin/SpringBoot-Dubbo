package com.personal.dubbo.provider;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Welcome to HuFei's Dubbo, Hello " + name;
	}
}
