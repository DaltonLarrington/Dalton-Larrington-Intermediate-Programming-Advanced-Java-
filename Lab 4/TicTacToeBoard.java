import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TicTacToeBoard extends JFrame {	
	
	
	private Container pane;
	private String currentPlayer;
	private JButton [][] board;
	private boolean hasWinner;	
	
	public TicTacToeBoard() {
		super();
		pane = getContentPane();
		pane.setLayout(new GridLayout(3, 3));
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		currentPlayer = "x";
		board = new JButton[3][3];
		hasWinner = false;
		initializeBoard();
		
	}	
	
	private void initializeBoard() {	
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				JButton btn = new JButton("");
				btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
				board[i][j] = btn;
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(((JButton)e.getSource()).getText().equals("") && hasWinner == false) {
							btn.setText(currentPlayer);
							
						}	
					
					}
					
				});
				
				pane.add(btn);
				
			}
			
		}		
		
	}
	
}
