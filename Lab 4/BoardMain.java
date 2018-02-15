/*
 * Programmer: Dalton Larrington
 * Date: 2-10-18
 * Description: To run a functional tic-tac-toe game
 */

import java.awt.Component;

import javax.swing.JFrame;

public class BoardMain {

	public static void main(String[] args) {	
		
		JFrame f = new JFrame("Dalton's Tic-Tac-Toe");		
		BoardApp board = new BoardApp(); 
		
		f.add(board);
		f.setSize(600,600);
		f.setVisible(true);


	

			

		

	}

}
