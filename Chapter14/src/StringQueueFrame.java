//************************************************************************************************
//Programmer: Christopher Murphy
//Program/Class: Queue of Strings with GUI/ StringQueDisplayFrame.java
//Details: This is the main class and GUI frame for the project
//
//************************************************************************************************
import javax.swing.JFrame;
/**
 * 
 * @author Failbot
 *
 */
public class StringQueueFrame {
	
	public static void main(String[] args) {
	
		/**
		 *  creates a frame and adds the panel from StringDisplayPanel, standard close/visibility options 
		 */
		JFrame frame = new JFrame("A stack that unpacks Strings");
		
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		StringQueueDisplayPanel panel = new StringQueueDisplayPanel();
		
		frame.getContentPane().add(panel);
	
		frame.pack();
		frame.setVisible(true);
	
	}

}
