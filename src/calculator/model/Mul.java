package calculator.model;

public class Mul extends ExprNary{

	@Override
	public double operate(double x, double y) {
		return x * y;
	}
	
}
