/*
 * Programmer: Dalton Larrington
 * Date: 2-2-18
 * Description: To display a functional web browser.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class WebBrowser extends JFrame {
	
	private JTextField addressBar;
	private JEditorPane display;
	
	//Constructor
	public WebBrowser() {
		
		super("Dalton's Web Browser");
		
		addressBar = new JTextField("URL (Delete and enter http://): ");
		addressBar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {					
				loadPage(e.getActionCommand());
				
			}
			
		}
		
	);
		//Creates an addressBar at the top of the window
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
				
				new HyperlinkListener() {
					
					//Activates the URL when entered
					public void hyperlinkUpdate(HyperlinkEvent e) {
						if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
							loadPage(e.getURL().toString());
							
							
					}
						
				}					
					
			}
					
		);	
		
		//Display browser window
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500, 300); 
		setVisible(true);
	
		}
	
		private void loadPage(String userText) {
			
			try {
				
				display.setPage(userText);
				
			} catch (Exception e) {
				
				System.out.println("Error: Something went wrong");
			}
			
		}
				
}
				
				
			
			
	
		
					
			
			
		
	
	
