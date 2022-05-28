package com.javatpoint;

// all the imports are for different component, for example we have used JTextField, we had to use "import javax.swing.JTextField" 
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class user extends JFrame { // we have used JFrame functionality in our user class, so we have inherited
									// those from JFrame class using extends keyword

	private JPanel contentPane;
	private JTextField textField;

	// userWindow object is static because we have used this inside static function main
	public static user userWindow;

	/**
	 * Launch the application. The application will start from this main function.
	 */
	public static void main(String[] args) {

		// user code 
		///1
		userWindow = new user(); // creating object of user class
		userWindow.setVisible(true); // visible true so that it will display the window for taking user name

	}

	/**
	 * Create the frame. These codes are generating automatically from
	 * windowBuilder. We are just writing code here for 
	 * 1) opening userWindow
	 * 2) getting text from textfield and 
	 * 3) opening gamingWindow
	 */

	public user() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblUserName = new JLabel("user name");
		contentPane.add(lblUserName, BorderLayout.WEST);

		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);

		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// user code
				///2
				String user = textField.getText(); // getting text from the textfield
				UserManagement.userName = user; // setting the written user name on textfield in userName variable from
												// UserManagement class
				// user name: if not static
				// UserManagement objSnaha = new UserManagement();
				// objSnaha.userName = user;

				userWindow.setVisible(false); // user name window is now not visible

				/// 3
				JApps gamingWindow = new JApps(); // creating object of JApps class
				gamingWindow.setVisible(true); // showing the gaming window Frame here

			}
		});
		contentPane.add(btnEnter, BorderLayout.EAST);
	}

}
