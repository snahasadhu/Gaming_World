package com.javatpoint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CharCount extends JFrame implements ActionListener {
	JLabel lb1, lb2;
	JTextArea ta;
	JButton b; // declaring count button here
	JButton pad, text;

	CharCount() {
		super("Char Word Count Tool - JTP");
		lb1 = new JLabel("Characters: ");
		lb1.setBounds(50, 50, 300, 20);
		lb2 = new JLabel("Words: ");
		lb2.setBounds(50, 80, 100, 20);

		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		sp.setBounds(50, 110, 300, 200);

		b = new JButton("Count"); // initializing count button here
		b.setBounds(50, 320, 80, 30);// x,y,w,h
		b.addActionListener(this);

		pad = new JButton("Pad Color");
		pad.setBounds(140, 320, 110, 30);// x,y,w,h
		pad.addActionListener(this);

		text = new JButton("Text Color");
		text.setBounds(260, 320, 110, 30);// x,y,w,h
		text.addActionListener(this);

		add(lb1);
		add(lb2);
		add(sp);
		add(b);
		add(pad);
		add(text);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) { // this will work for all three buttons. if count button is pressed
													// then e.getSource() will be b so count operation will be executed
		if (e.getSource() == b) {

			String text = ta.getText(); // Everything user writing on the text area will be stored in text variable. 

			// for space count
			int spaceCount = 0;
			for (char c : text.toCharArray()) { // checking each character in the written text
				if (c == ' ') {
					spaceCount++;
				}
			}

			lb1.setText("Characters: " + text.length() + ", Space: " + spaceCount); // + ", Space: "+spaceCount

			//word counting
			String words[] = text.split("\\s"); // based on space we are separating words.
			lb2.setText("Words: " + words.length); //words. length is counting how many words are there in the words[] array

		} else if (e.getSource() == pad) {
			Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
			ta.setBackground(c); // setting color of background of textarea
		} else if (e.getSource() == text) {
			Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
			ta.setForeground(c); // setting color of text of textarea
		}
	}

	public static void main(String[] args) {
		new CharCount();// calling constructor of this class
	}
}