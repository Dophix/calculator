package calculator.model;

public class Add extends ExprNary {

	@Override
	public double operate(double x, double y) {
		return x + y;
	}

}
