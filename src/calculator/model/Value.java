package calculator.model;

public class Value implements Expr {
	
	// Attributes
	
	private double value;
	
	// Constructors
	
	public Value(double value) {
		this.value = value;
	}
	
	// Accessors
	
	public double get() {
		return this.value;
	}
	
	public void set(double value) {
		this.value = value;
	}
	
	// Overrides

	@Override
	public double execute() {
		return value;
	}

}
