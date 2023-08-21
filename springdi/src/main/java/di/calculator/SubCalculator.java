package di.calculator;

import org.springframework.stereotype.Component;

@Component("SubCalculator")
public class SubCalculator implements Calculator {

	public int calculate(int n1, int n2) {
		return n1 - n2;
	}
}