package com.javatpoint;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JApps extends JFrame {

	private JPanel contentPane;

	/**
	 * 
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { // user obj = new user(); //
	 * obj.setVisible(true);
	 * 
	 * JApps frame = new JApps(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } });
	 * 
	 * // JApps frame = new JApps(); // frame.setVisible(true); }
	 */

	/**
	 * Create the frame.
	 */
	public JApps() {
		setTitle("Java Gaming World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblJavaGamingWorld = new JLabel("Hello, " + UserManagement.userName); // as userName is static i am
																							// getting values from user
																							// class, so i am not
																							// creating object.
		// if i create again object here then this object will be different than the
		// user object so value will not come from there.
		// we can also use object, but that system will be different.

		lblJavaGamingWorld.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblJavaGamingWorld.setForeground(new Color(204, 51, 51));

		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TTT1.main(new String[] {}); // calling main function of TTT1 class, here also we are not creating
											// object, just using static main function for calling
			}
		});
		button_2.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/tictactoe.jpg"))); // setting image to button

		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/picturepuzzle.jpg")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				picpuzzle2.main(new String[] {});
			}
		});

		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharCount.main(new String[] {});
			}
		});
		button_4.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/wct.jpg")));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()

								.addPreferredGap(ComponentPlacement.UNRELATED)

								.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(186)
								.addComponent(lblJavaGamingWorld))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()

								.addPreferredGap(ComponentPlacement.UNRELATED)

								.addPreferredGap(ComponentPlacement.UNRELATED)))
				.addContainerGap(17, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(12).addComponent(lblJavaGamingWorld)
						.addGap(18).addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED).addContainerGap(17, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}