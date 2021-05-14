package calculator.model.converter;

public class Decimal implements Converter {

	@Override
	public double s2d(String str) {
		return Double.parseDouble(str); 
	}

	@Override
	public String d2s(double nbr) {
		return String.valueOf(nbr);
	}

}
