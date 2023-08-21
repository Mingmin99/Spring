package di.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("MyCalculator")
public class MyCalculator {
	private int firstNum = 10;
	private int secondNum = 3;
	private Calculator calculator;

	@Autowired
	public MyCalculator(@Qualifier("AddCalculator") Calculator calculator) {
		this.calculator = calculator;
	}

	public void printResult() {
		System.out.println("결과는: " + calculator.calculate(firstNum, secondNum));
	}
}
