package calculator.model.expr;

public abstract class ExprUnary implements Expr {

	protected Expr x;

	ExprUnary(Expr x) {
		this.x = x;
	}
	
}
