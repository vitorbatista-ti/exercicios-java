import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberPanel extends JPanel implements ActionListener{

	private JTextField txtText;
	
	public NumberPanel(JTextField txtText) {
		this.txtText = txtText;
		
		setLayout(new GridLayout(4,3));
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(this);
		add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(this);
		add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(this);
		add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(this);
		add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(this);
		add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(this);
		add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(this);
		add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(this);
		add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(this);
		add(btn9);
		
		JButton btnnull = new JButton();
		btnnull.setEnabled(false);
		add(btnnull);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(this);
		add(btn0);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(this);
		add(btnponto);
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (txtText.getText().length()==10) {
			return;
		}
		
		JButton btn = (JButton) e.getSource();
		String numero = btn.getText();
		txtText.setText(txtText.getText() + numero);
		
	}

}
