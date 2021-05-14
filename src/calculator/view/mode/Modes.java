package calculator.view.mode;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Modes extends JPanel{
	
	ButtonGroup group = new ButtonGroup();
	
	public Modes() {
		this.setBorder(BorderFactory.createTitledBorder("Modes"));
	}
	
	public void addMode(Mode mode) {
		this.add(mode);
		this.group.add(mode);
	}
	
	public void removeMode(Mode mode) {
		this.remove(mode);
		this.group.remove(mode);
	}

}
