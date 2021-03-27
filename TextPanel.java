import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {


		private JTextField txtNumber;
		
		
	public TextPanel() {
		setLayout(new FlowLayout());
		txtNumber = new JTextField(10);
		txtNumber.setHorizontalAlignment(JTextField.RIGHT);
		txtNumber.setEnabled(false);
		add(txtNumber);
		
		
	}


	public JTextField getTxtNumber() {
		return txtNumber;
	}


}
