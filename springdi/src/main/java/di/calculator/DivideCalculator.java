package di.calculator;

import org.springframework.stereotype.Component;

@Component("DivideCalculator")
public class DivideCalculator implements Calculator {

	public int calculate(int n1, int n2) {
		return n1 / n2;
	}
}