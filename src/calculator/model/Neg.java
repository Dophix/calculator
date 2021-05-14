package calculator.model;

public class Neg extends ExprUnary{

	Neg(Expr x) {
		super(x);
	}

	@Override
	public double execute() {
		return - this.x.execute();
	}
	
}
