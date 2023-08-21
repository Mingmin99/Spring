package di.calculatorJava;

import org.springframework.stereotype.Component;

@Component("AddCalculator")
public class AddCalculator implements Calculator {

	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
}