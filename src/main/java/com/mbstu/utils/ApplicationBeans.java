package com.mbstu.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationBeans {

	public static Object getBeans(String beans) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Object obj = (Object) context.getBean(beans);
		return obj;
	}
}
