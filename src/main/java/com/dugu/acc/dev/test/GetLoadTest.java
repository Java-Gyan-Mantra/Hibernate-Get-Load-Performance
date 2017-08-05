package com.dugu.acc.dev.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dugu.acc.dev.service.PerformanceCheckService;

public class GetLoadTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dugu/acc/dev/config/application-context.xml");
		PerformanceCheckService service = (PerformanceCheckService) context
				.getBean("performanceCheckService");
		for (int i = 1; i <= 3; i++) {
			System.out.println("in call : - " + i);
			System.out.println("*******************************");
			System.out.println(service.getCallTime(143));
			System.out.println(service.loadCallTime(143));
		}
	}
}
