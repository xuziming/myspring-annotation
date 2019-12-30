package com.atguigu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;

public class MainTest {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Person bean = (Person) applicationContext.getBean("person");
//		System.out.println(bean);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = ctx.getBean(Person.class);
		System.out.println(person);

		String[] namesForType = ctx.getBeanNamesForType(Person.class);
		for (String name : namesForType) {
			System.out.println(name);
		}

		ctx.close();// 关闭资源
	}

}