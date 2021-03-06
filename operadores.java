import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class operadores extends JPanel implements ActionListener {

	
	private JTextField txtText;
	
	private char   op;
	private double valor1;
	private double valor2;
	
	private JButton btnSoma;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnEq;
	private JButton btnClear;
	private JButton btnPerc;
	
	public operadores(JTextField txtText) {
	
this.txtText = txtText;
		
		setLayout(new GridLayout(3,3));
		
		btnSoma = new JButton("+");
		btnSoma.addActionListener(this);
		add(btnSoma);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		add(btnSub);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(this);
		add(btnMult);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		add(btnDiv);
		
		btnEq = new JButton("=");
		btnEq.addActionListener(this);
		add(btnEq);
		
		
		btnPerc = new JButton("%");
		btnPerc.addActionListener(this);
		add(btnPerc);
		
		
		
		JButton btnnull1 = new JButton();
		btnnull1.setEnabled(false);
		add(btnnull1);
		
		
		JButton btnnull2 = new JButton();
		btnnull2.setEnabled(false);
		add(btnnull2);
		
		
		btnClear = new JButton("C");
		btnClear.addActionListener(this);
		add(btnClear);
				
		
	}


@Override
public void actionPerformed(ActionEvent e) {
	
	if(txtText.getText().isEmpty()) {
		return;
	}
	
	JButton btn = (JButton) e.getSource();
	
	if(btn == btnClear) {
		op = '\u0000';
		txtText.setText("");
	}else if(btn == btnEq) {

		valor2 = Double.parseDouble(txtText.getText());
		double result= 0.0;
		
		if(op == '+') {
			result = valor1 + valor2;
		}else if (op == '-') {
			result = valor1 - valor2;
		}else if (op == '*') {
			result = valor1 * valor2;
		}else if (op == '/') {
			result = valor1 / valor2;
		}else if (op == '%') {
			result = (valor1 * (valor2/100));
		}
	
	
	txtText.setText(String.valueOf(result));
	op = '\u0000';
	valor1= result ;
	valor2= 0;
	
	}else {
		op =btn.getText().charAt(0);
		valor1 = Double.parseDouble(txtText.getText());
		txtText.setText("");
	}

		}

}
