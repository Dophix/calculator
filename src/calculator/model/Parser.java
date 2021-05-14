package calculator.model;

import java.util.ArrayList;
import java.util.Stack;

import calculator.model.converter.Converter;
import calculator.model.expr.Expr;

public class Parser {
	
	private String str;
	private Expr expr;
	private Converter converter;
	
	public Parser(String str) {
		this.str = str;
	}
	
	private Expr parse(String str) {
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> operations = new ArrayList<String>();
		int i = 0;
		while (i < str.length()) {
			System.out.print(str.charAt(i) + " ");
			i++;
		}
		System.out.println(values);
		System.out.println(operations);
		return null;
	}
	
	public String result() {
		return converter.d2s(this.expr.execute());
	}
	
}
