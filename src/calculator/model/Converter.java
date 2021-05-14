package calculator.model;

public abstract class Converter {
	
	protected double number;
	
	public void set(double number) {
		this.number = number;
	}
	
	public abstract String convert();
}
