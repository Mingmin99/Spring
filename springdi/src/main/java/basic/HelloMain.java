package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {

		// 1.spring Container생성
		ApplicationContext context = new GenericXmlApplicationContext("basic-beanContainer.xml");
		Hello h = (Hello) context.getBean("h1");
		h.printHello();

//        Hello hh = (Hello)context.getBean(Hello.class);
		// bean의 class가 1개만 존재할 때 가능한 문법

		Hello hh = (Hello) context.getBean("h2", Hello.class);
		hh.printHello();
		// bean의 class가 여러개일 때는 이런식으로 사용

		System.out.println(h);
		System.out.println(hh);

	}

}