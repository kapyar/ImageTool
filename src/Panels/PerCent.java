package Panels;

import Factories.ComponentFactory;
import ViewComponents.MetroPanel;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PerCent extends MetroPanel {
	private JTextField textField;

	public PerCent() {

		textField = ComponentFactory.GET.getMetroTextSmall();
		textField.setLocation(20, 9);
		add(textField);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "%", "px" }));
		comboBox.setBounds(116, 9, 28, 20);

		add(comboBox);
	}

	/**
	 * To clean field
	 */
	public void clean() {
		textField.setText("");
	}

}
