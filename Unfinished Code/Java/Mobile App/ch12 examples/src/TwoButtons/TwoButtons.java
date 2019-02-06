package TwoButtons;

import java.awt.*;
import javax.swing.*;

public class TwoButtons {

	public static void main(String[] args) {
		// create new JFrame
	     JFrame myFrame = new JFrame();

	     // set the frame title, size, location
	     myFrame.setTitle("Choose Your Color");
	     myFrame.setSize(550, 150);
	     myFrame.setLocation(200, 300);

	     // make sure program terminates when window is closed
	     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	     // assign a layout
	     FlowLayout myLayout = new FlowLayout();
	     myFrame.setLayout(myLayout);

	     // create and add buttons to the frame
	     JButton redButton = new JButton("Red");
	     JButton greenButton = new JButton("Green");

	     myFrame.add(redButton);
	     myFrame.add(greenButton);

	     // make the frame visible
	     myFrame.setVisible(true);

	}

}
