package di.calculatorJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.calculator.MyCalculator;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(di.calculatorJava.Config.class);
		// MyCalculator 빈을 가져옴
		di.calculatorJava.MyCalculator myCalculator = context.getBean("mycalculator",
				di.calculatorJava.MyCalculator.class);

		// MyCalculator의 printResult 메서드 호출
		myCalculator.printResult();
	}
}