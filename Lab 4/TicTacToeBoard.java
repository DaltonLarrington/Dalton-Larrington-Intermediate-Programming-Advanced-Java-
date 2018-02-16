import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {
	
	int titleFontSize = 36;
	
	public TicTacToeBoard() {
		
		setSize(322, 422);
		setBackground(Color.WHITE);
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);	
		g.setColor(Color.black);
		//font (font name, font.style, size)
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize));
		g.drawString("Dalton's Tic-Tac-Toe", 0,((50 - titleFontSize) /2 + titleFontSize));
		
	}

}
