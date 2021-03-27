import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calc extends JFrame {

	public Calc() {
		super("calculadora retrô");
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (400,400);
		setLocation (400,200);
		
		setLayout(new BorderLayout());
		
		TextPanel textPanel  = new TextPanel();
		add(BorderLayout.NORTH, textPanel);
		
		JPanel digitospanel = new JPanel();
		digitospanel.setLayout(new BorderLayout());
		digitospanel.add(BorderLayout.CENTER, new NumberPanel(textPanel.getTxtNumber()));
		digitospanel.add(BorderLayout.EAST,new OperactionsPanel(textPanel.getTxtNumber()));
		add(BorderLayout.CENTER,digitospanel);
		
				
		
		setVisible(true);
	}
		
		public static void main(String[] args) throws Exception {
			new Calc();
	}

}
