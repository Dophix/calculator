package calculator.model;

public abstract class Parser {
	
	protected String str;
	protected Expr expr;
	
	private Converter conv;
	
	protected Parser(String str) {
		this.str = str;
	}
	
	public abstract void parse();
	
	public String result() {
		conv.set(expr.execute());
		return conv.convert();
	}
	
}
