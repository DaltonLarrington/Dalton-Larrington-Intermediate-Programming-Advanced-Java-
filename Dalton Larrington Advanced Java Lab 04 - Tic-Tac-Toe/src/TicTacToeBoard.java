import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Array;
import java.util.AbstractList;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {

	int titleFontSize = 36;
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> OList = new ArrayList<DrawnO>();

	public TicTacToeBoard() {

		setSize(322, 422);
		setBackground(Color.WHITE);
		
		Mouse m = new Mouse();
		addMouseListener(m);


	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);	
		g.setColor(Color.black);
		//font (font name, font.style, size)
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize));
		
		//Headings
		g.drawString("Dalton's Tic-Tac-Toe", 0,((50 - titleFontSize) /2 + titleFontSize));			
		g.drawString("Instructions: ", 0,((1080 - titleFontSize) /2 + titleFontSize));
		
		//Board
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);
		g.drawLine(200, 0, 200, 640);
		g.drawLine(400, 0, 400, 640);
		
		for(TicTacToeBoard.DrawnX thisX : xList) {	
			
			g.drawString("X", thisX.xCoord, thisX.yCoord);
			
		}
		
		for(TicTacToeBoard.DrawnO thisX : OList) {
			
		}
		
		DrawnX testX = new DrawnX(200, 200);
		DrawnO testO = new DrawnO(100, 200);

		g.drawString("X", testX.xCoord, testX.yCoord);
		g.drawString("O", testO.xCoord, testO.yCoord);

	}

	class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
	
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			System.out.println(e.getX() + " " + e.getY());
			DrawnX X = new DrawnX(e.getX()-11, e.getY()+13);
			xList.add(X);
			repaint();
			
			System.out.println(e.getX() + " " + e.getY());
			DrawnO O = new DrawnO(e.getX()-11, e.getY()+13);
			OList.add(O);
			repaint();				
			
		}


	}

	class DrawnX {

		int xCoord = 200;
		int yCoord = 200;

		public DrawnX(int xCoord, int yCoord) {

			this.xCoord = xCoord;
			this.yCoord = yCoord;

		}		


	}

	class DrawnO {

		int xCoord = 100;
		int yCoord = 200;

		public DrawnO(int xCoord, int yCoord) {

			this.xCoord = xCoord;
			this.yCoord = yCoord;

		}		


	}	
		
	}






