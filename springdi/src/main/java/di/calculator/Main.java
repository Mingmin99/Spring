package di.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("calculatorAnnotation04.xml");

		// MyCalculator 빈을 가져옴
		MyCalculator myCalculator = context.getBean("MyCalculator", MyCalculator.class);

		// MyCalculator의 printResult 메서드 호출
		myCalculator.printResult();
	}
}