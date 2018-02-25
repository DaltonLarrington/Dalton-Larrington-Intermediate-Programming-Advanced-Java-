import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.sql.Array;
import java.util.AbstractList;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {

	int titleFontSize = 20;
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> OList = new ArrayList<DrawnO>();
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem quit;

	public TicTacToeBoard() {
		
		setSize(322, 422);
		setBackground(Color.WHITE);		
		Mouse m = new Mouse();
		addMouseListener(m);
		intializeMenuBar();
		
	}
	
	private void intializeMenuBar() {
		
		menuBar = new JMenuBar();
		menu = new JMenu("Options");		
	
		quit = new JMenuItem("Quit");
		quit.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
			
		}
		
	});	
	
	menu.add(quit);
	menuBar.add(menu);
	setJMenuBar(menuBar);
	
	}
	
	private void setJMenuBar(JMenuBar menuBar2) {
		// TODO Auto-generated method stub
		
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);	
		g.setColor(Color.black);
		
		//font (font name, font.style, size)
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize));
		
		//Headings
		g.drawString("Dalton's Tic-Tac-Toe", 0,((50 - titleFontSize) /2 + titleFontSize));			
		g.drawString("Instructions: ", 0,((1080 - titleFontSize) /2 + titleFontSize));
		
		//Instructions
		g.drawString("There are two players who alternate between playing their symbol, X or O", 0,((1150 - titleFontSize) /2 + titleFontSize));
		g.drawString("One player must get 3 of their symbols in a row to win", 0,((1250 - titleFontSize) /2 + titleFontSize));
		g.drawString("If there is one box left, and no one has won, that is considered a scratch game.", 0,((1350 - titleFontSize) /2 + titleFontSize));
		
		//Board
		g.drawLine(20, 200, 540, 200);
		g.drawLine(20, 400, 540, 400);
		g.drawLine(200, 60, 200, 540);
		g.drawLine(400, 60, 400, 540);
		
		for(TicTacToeBoard.DrawnX thisX : xList) {	
			
			g.drawString("X", thisX.xCoord, thisX.yCoord);			
			
		}	
		
		for(TicTacToeBoard.DrawnO thisO : OList) {
			
			g.drawString("O", thisO.xCoord, thisO.yCoord);
			
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
		
	






