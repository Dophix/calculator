package calculator.model.expr;

public class Div extends ExprNary{

	@Override
	public double operate(double x, double y) {
		return x / y;
	}

}
