import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frameObj = new JFrame();
	JLabel welcomeLabel = new JLabel("WELCOME!");

	
	public WelcomePage(String userID) {
		
		welcomeLabel.setBounds(0, 0, 200, 35);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 20));
		welcomeLabel.setText("WELCOME " + userID + "!");
		frameObj.add(welcomeLabel);
		
		frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameObj.setSize(420, 420);
		frameObj.setLayout(null);
		frameObj.setVisible(true);
		
	}
}
