import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class BoardApp {

	JButton buttons[] = new JButtons[9];

	public Board() {

		setLayout(new GridLayout(3, 3));
		intializebuttons();

	}

	public void initializebuttons() {

		for(int i = 0; i <= 8; i++) {		

			buttons[i] = new JButton();	
			buttons[i].setText("");
			buttons[i].addActionListener(new buttonListener());
			add(buttons[i]);

		}

	} 

	public void resetButtons() {

		for(int = 0; i <= 8; i++) {
			
			buttons[i].setText("");
			
		}

	}
	
	private class buttonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			JButton buttonClicked = (JButton)e.getSource();
			
			if(second % 2 == 0) {
				
				buttonClicked.setText("X");
				
			}
			
				else 					
					
					buttonClicked.setText("O");	
			
			if(checkForWin() == true) {
				
				JOptionPaneShowConfirmDialog(null, "Gamer Over");
				resetButtons();
					
				
			}
			
			second++;				
			
		}
		
		public boolean checkForWin() {
			
			
			
		}
		
	}









}