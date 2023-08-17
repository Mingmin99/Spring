package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("SpringXml02.xml");

		Car car1 = (Car) context.getBean("car", Car.class);
		car1.printTireBrand();

		System.out.println("----------------------------------------------------");
		
		System.out.println(car1.toString());
		car1.printsTireBrand();
	}

}