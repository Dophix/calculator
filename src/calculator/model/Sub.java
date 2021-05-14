package calculator.model;

public class Sub extends ExprNary {

	@Override
	public double operate(double x, double y) {
		return x - y;
	}

}
