/*
 * Programmer: Dalton Larrington
 * Date: 2-2-18
 * Description: To display a functional web browser.
 */

import javax.swing.JFrame;

public class WebBrowserMain {

	public static void main(String[] args) {
		
		WebBrowser webPage = new WebBrowser();		
		webPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
