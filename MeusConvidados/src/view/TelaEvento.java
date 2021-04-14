package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TelaEvento extends JPanel {

	public TelaEvento() {
		setBounds(0, 0,533, 379);
		setLayout(null);
		setVisible(true);
		
		JLabel lblTest = new JLabel("Test");
		lblTest.setBounds(173, 136, 245, 111);
		add(lblTest);
	}
}
