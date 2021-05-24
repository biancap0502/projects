import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	JFrame frameObj = new JFrame();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLable = new JLabel("WELCOME!");
	Map<String, String> loginInfo = new HashMap<String, String>();
	
	
	public LoginPage(Map<String, String> loginInfo) {
		this.loginInfo = loginInfo;
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLable.setBounds(125, 250, 250, 35);
		messageLable.setFont(new Font(null, Font.BOLD, 15));
		
		userIDField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frameObj.add(userIDLabel);
		frameObj.add(userPasswordLabel);
		frameObj.add(messageLable);
		frameObj.add(userIDField);
		frameObj.add(userPasswordField);
		frameObj.add(loginButton);
		frameObj.add(resetButton);
		frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameObj.setSize(420, 420);
		frameObj.setLayout(null);
		frameObj.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if (e.getSource() == loginButton) {
			String userID = userIDField.getText();
			String userPassword = String.valueOf(userPasswordField.getPassword());
			
			if (loginInfo.containsKey(userID)) {
				if (loginInfo.containsValue(userPassword)) {
					messageLable.setForeground(Color.GREEN);
					messageLable.setText("Login successful!");
					frameObj.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				} else {
					messageLable.setForeground(Color.RED);
					messageLable.setText("Incorrect password");
				}
			}
		} else {
			messageLable.setForeground(Color.RED);
			messageLable.setText("Username not found!");
		}
		
		
	}
	
	

}
