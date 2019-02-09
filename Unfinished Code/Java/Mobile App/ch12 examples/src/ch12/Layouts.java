package ch12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class Layouts {
	JFrame myFrame;
	JButton appleButton;
	JButton orangeButton;
	JButton pearButton;
	JButton bananaButton;
	
	public Layouts() {
		myFrame = new JFrame();
		
		JPanel myPanel = (JPanel)myFrame.getContentPane();
		
		//FlowLayout layout = new FlowLayout();
		
		/*GridLayout layout = new GridLayout(3,2,5,100);
		layout.setHgap(35);
		layout.setVgap(35);*/
		
		BorderLayout layout = new BorderLayout(5,10);
		
		
		myPanel.setLayout(layout);
		myFrame.setSize(550, 150);
		myFrame.setLocation(200, 300);
		
		//Make sure the program can close.
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setContentPane(myPanel);
		appleButton = new JButton("Apple");
		myPanel.add(appleButton, BorderLayout.LINE_START);
		orangeButton = new JButton("Orange");
		myPanel.add(orangeButton, BorderLayout.PAGE_END);
		pearButton = new JButton("Pear");
		myPanel.add(pearButton, BorderLayout.PAGE_START);
		bananaButton = new JButton("Banana");
		myPanel.add(bananaButton, BorderLayout.LINE_END);
		
		myFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
