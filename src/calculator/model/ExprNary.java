package calculator.model;

import java.util.ArrayList;

public abstract class ExprNary implements Expr {
	private ArrayList<Expr> args = new ArrayList<Expr>();
	
	@Override
	public double execute() {
		double result = args.get(0).execute();
		for (int i = 1; i < this.args.size(); i++) {
			result = operate(result, args.get(i).execute());
		}
		return result;
	}
	
	public abstract double operate(double x, double y);
	
	public void add(Expr expr) {
		this.args.add(expr);
	}
	
	public void add(Expr...exprs) {
		for (Expr expr : exprs) {
			this.args.add(expr);
		}
	}
}
