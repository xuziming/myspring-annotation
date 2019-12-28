package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.ext.ExtConfig;

public class IOCTest_Ext {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);

		// 发布事件；
		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
			private static final long serialVersionUID = 7159070003828140052L;
		});

		applicationContext.close();
	}

}
