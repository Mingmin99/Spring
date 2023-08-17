package di.annotation02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.annotation01.Car;

public class DriverMain {


		public static void main(String[] args) {
			ApplicationContext context = new GenericXmlApplicationContext("SpringAnnotation02.xml");

			Car c = context.getBean("car", Car.class);
			c.printTireBrand();

		}

	}
