import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TicTacToeMain {

	public static void main(String[] args) {
		
		createAndShowGUI();

	}
	
	private static void createAndShowGUI() {
		
		 TicTacToeBoard board = new TicTacToeBoard();
		 
		JFrame frame = new JFrame("Tic Tac Toe Board");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(board);
		
		//May need to change size to account for borders and file size
		frame.setSize(322, 422);			
		
		frame.setVisible(true);		
		
	}
	
}