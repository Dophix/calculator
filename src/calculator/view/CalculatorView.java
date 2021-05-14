package calculator.view;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import calculator.view.mode.Modes;
import calculator.view.mode.Mode;

public class CalculatorView extends JFrame {
	
	public CalculatorView() {
		
		this.setVisible(true);
		this.setLayout(new GridLayout(3, 1));
		this.setResizable(false);
		
		this.add(new InputFieldView());
		Modes modes = new Modes();
		modes.addMode(new Mode());
		modes.addMode(new Mode());
		modes.addMode(new Mode());
		modes.addMode(new Mode());
		modes.addMode(new Mode());
		modes.addMode(new Mode());
		modes.addMode(new Mode());
		
		
		this.add(modes);
		
		this.pack();
	}
}
