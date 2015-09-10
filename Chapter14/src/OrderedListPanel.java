//************************************************************************************************
//Programmer: Christopher Murphy
//Program/Class: Stack of Strings with GUI/ StringQueDisplayPanel.java
//Details: This is the panel added to the StringQueFrame, it contains the que itself as well
//as the GUI representation of the program, with joined listeners
//************************************************************************************************
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Queue;
import java.util.LinkedList;
/**
 * 
 * @author Failbot
 *
 */
public class OrderedListPanel extends JPanel {
	
/**
 * declarations	
 */
	private JButton queueButton, dequeueButton, showQueueButton;
	private JLabel instructionLabel, displayOutputLabel;
	private JTextField enterStringTextField;

	
	Queue<String> stringQueue = new LinkedList<String>();
	
	
	/**
	 * constructor
	 */
	public OrderedListPanel() {
		
	
		
		/**
		 * buttons are created		
		 */
		queueButton = new JButton("Add to queue");
		dequeueButton = new JButton ("Remove from queue");
		showQueueButton = new JButton ("Show Queue");
		
		
		/**
		 * action listeners added to the buttons
		 */
		ButtonListener bListener = new ButtonListener();
		queueButton.addActionListener(bListener);
		dequeueButton.addActionListener(bListener);
		showQueueButton.addActionListener(bListener);
		
		
		
		
		/**
		 * labels and text field are created
		 */
		enterStringTextField = new JTextField(20); 
		instructionLabel = new JLabel ("Enter String: ");
		displayOutputLabel = new JLabel (" ");
		
		
		
		
		
		/**
		 *  panel components are added here
		 */
		add(instructionLabel);
		add(enterStringTextField);
		add(queueButton);
		add(dequeueButton);
		add(showQueueButton);
		add (displayOutputLabel);
		
		/**
		 *  frame shape is declared here
		 */
		setPreferredSize(new Dimension(750,100));
		
		
		
	}
	
	/**
	 * button listener has case statement to determine action of stack object
	 * @author Failbot
	 *
	 */
	public class ButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event){
			
			if (event.getSource() == queueButton)
				stringQueue.add(enterStringTextField.getText());
				displayOutputLabel.setText("String at the front of the queue: " + stringQueue.peek());
				enterStringTextField.setText(null);
				
			if (event.getSource() == dequeueButton)
				stringQueue.remove();
				displayOutputLabel.setText("String at the front of the queue: " + stringQueue.peek());
			
			if (event.getSource() == showQueueButton)
				
				displayOutputLabel.setText(""+ stringQueue + "");
			
		}
		
	}

	
	
}