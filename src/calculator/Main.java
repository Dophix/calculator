package calculator;

import calculator.model.Parser;
import calculator.model.parser.Postfix;
import calculator.view.CalculatorView;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println(Postfix.evaluate("13 24 1 4 + 5 - * +"));
	}

}
