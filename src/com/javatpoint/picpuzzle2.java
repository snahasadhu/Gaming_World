package com.javatpoint;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class picpuzzle2 extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, starB, sample, sampleSnaha, sampleAfridi, sampleKeya, sampleMaria;// declaring
	Icon star;
	Icon ic0 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/starB0.jpg"));
	Icon ic10 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/starB10.jpg"));
	Icon ic20 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/starB20.jpg"));
	Icon ic30 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/starB30.jpg"));
	Icon ic40 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/starB40.jpg"));// start position of each
																							// picture

	Icon samicon1 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/main.jpg"));
	Icon samicon2 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/main2.jpg"));
	Icon samicon3 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/main3.jpg"));
	Icon samicon4 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/main4.jpg"));
	Icon samicon5 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/main5.jpg"));// selection picture for
																							// each puzzle game

	Icon ic1 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/1.jpg"));
	Icon ic2 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/5.jpg"));
	Icon ic3 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/2.jpg"));
	Icon ic4 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/7.jpg"));
	Icon ic5 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/4.jpg"));
	Icon ic6 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/6.jpg"));
	Icon ic7 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/8.jpg"));
	Icon ic8 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/9.jpg"));
	Icon ic9 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/3.jpg"));

	Icon ic11 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/12.jpg"));
	Icon ic12 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/13.jpg"));
	Icon ic13 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/16.jpg"));
	Icon ic14 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/11.jpg"));
	Icon ic15 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/14.jpg"));
	Icon ic16 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/19.jpg"));
	Icon ic17 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/17.jpg"));
	Icon ic18 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/15.jpg"));
	Icon ic19 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/18.jpg"));

	Icon ic21 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/24.jpg"));
	Icon ic22 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/25.jpg"));
	Icon ic23 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/21.jpg"));
	Icon ic24 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/27.jpg"));
	Icon ic25 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/23.jpg"));
	Icon ic26 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/29.jpg"));
	Icon ic27 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/28.jpg"));
	Icon ic28 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/22.jpg"));
	Icon ic29 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/26.jpg"));

	Icon ic31 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/34.jpg"));
	Icon ic32 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/35.jpg"));
	Icon ic33 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/31.jpg"));
	Icon ic34 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/37.jpg"));
	Icon ic35 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/33.jpg"));
	Icon ic36 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/39.jpg"));
	Icon ic37 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/38.jpg"));
	Icon ic38 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/32.jpg"));
	Icon ic39 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/36.jpg"));

	Icon ic41 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/44.jpg"));
	Icon ic42 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/45.jpg"));
	Icon ic43 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/41.jpg"));
	Icon ic44 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/47.jpg"));
	Icon ic45 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/43.jpg"));
	Icon ic46 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/49.jpg"));
	Icon ic47 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/48.jpg"));
	Icon ic48 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/42.jpg"));
	Icon ic49 = new ImageIcon(JApps.class.getResource("/com/javatpoint/pic/46.jpg"));

	picpuzzle2() {

		super("Picture Puzzle");

		b1 = new JButton(ic1); // b1 button is initialized here and ic1 image icon is set to b1 button
		b1.setBounds(10, 80, 100, 100);
		b2 = new JButton(ic2);
		b2.setBounds(110, 80, 100, 100);
		b3 = new JButton(ic3);
		b3.setBounds(210, 80, 100, 100);
		b4 = new JButton(ic4);
		b4.setBounds(10, 180, 100, 100);
		b5 = new JButton(ic5);
		b5.setBounds(110, 180, 100, 100);
		b6 = new JButton(ic6);
		b6.setBounds(210, 180, 100, 100);
		b7 = new JButton(ic7);
		b7.setBounds(10, 280, 100, 100);
		b8 = new JButton(ic8);
		b8.setBounds(110, 280, 100, 100);
		b9 = new JButton(ic9);
		b9.setBounds(210, 280, 100, 100);
		sample = new JButton(samicon1);
		sample.setBounds(380, 100, 60, 60);

		sampleSnaha = new JButton(samicon2);
		sampleSnaha.setBounds(380, 170, 60, 60);

		sampleAfridi = new JButton(samicon3);
		sampleAfridi.setBounds(380, 250, 60, 60);

		sampleKeya = new JButton(samicon4);
		sampleKeya.setBounds(450, 100, 60, 60);

		sampleMaria = new JButton(samicon5);
		sampleMaria.setBounds(450, 170, 60, 60);

		JLabel l2 = new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
		l2.setBounds(5, 15, 500, 20);
		JLabel l3 = new JLabel("Select Picture From Above");
		l3.setBounds(380, 320, 200, 20);
		l3.setForeground(Color.red);

		starB = new JButton(ic0);
		starB.setBounds(330, 5, 50, 50);
		star = b9.getIcon(); // getting b9 button icon to star for showing in the above as a start icon for
								// the game.

		add(b1);// this.add adding button b1 to the frame panel
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(sample);
		add(l2);
		add(starB);
		add(l3);

		add(sampleSnaha);
		add(sampleAfridi);
		add(sampleKeya);
		add(sampleMaria);

		b1.addActionListener(this); // adding action listener interface for button click event
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		sample.addActionListener(this);
		sampleSnaha.addActionListener(this);
		sampleAfridi.addActionListener(this);
		sampleKeya.addActionListener(this);
		sampleMaria.addActionListener(this);
		setLayout(null);
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {// function for button action
		if (e.getSource() == b1) {
			Icon s1 = b1.getIcon();
			if (b2.getIcon() == star) {
				b2.setIcon(s1);
				b1.setIcon(star);
			} else if (b4.getIcon() == star) {
				b4.setIcon(s1);
				b1.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b2) {
			Icon s1 = b2.getIcon();
			if (b1.getIcon() == star) {
				b1.setIcon(s1);
				b2.setIcon(star);
			} else if (b5.getIcon() == star) {
				b5.setIcon(s1);
				b2.setIcon(star);
			} else if (b3.getIcon() == star) {
				b3.setIcon(s1);
				b2.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b3) {
			Icon s1 = b3.getIcon();
			if (b2.getIcon() == star) {
				b2.setIcon(s1);
				b3.setIcon(star);
			} else if (b6.getIcon() == star) {
				b6.setIcon(s1);
				b3.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b4) {
			Icon s1 = b4.getIcon();
			if (b1.getIcon() == star) {
				b1.setIcon(s1);
				b4.setIcon(star);
			} else if (b5.getIcon() == star) {
				b5.setIcon(s1);
				b4.setIcon(star);
			} else if (b7.getIcon() == star) {
				b7.setIcon(s1);
				b4.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b5) {
			Icon s1 = b5.getIcon();
			if (b2.getIcon() == star) {
				b2.setIcon(s1);
				b5.setIcon(star);
			} else if (b4.getIcon() == star) {
				b4.setIcon(s1);
				b5.setIcon(star);
			} else if (b6.getIcon() == star) {
				b6.setIcon(s1);
				b5.setIcon(star);
			} else if (b8.getIcon() == star) {
				b8.setIcon(s1);
				b5.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b6) {
			Icon s1 = b6.getIcon();
			if (b3.getIcon() == star) {
				b3.setIcon(s1);
				b6.setIcon(star);
			} else if (b5.getIcon() == star) {
				b5.setIcon(s1);
				b6.setIcon(star);
			} else if (b9.getIcon() == star) {
				b9.setIcon(s1);
				b6.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b7) {
			Icon s1 = b7.getIcon();
			if (b4.getIcon() == star) {
				b4.setIcon(s1);
				b7.setIcon(star);
			} else if (b8.getIcon() == star) {
				b8.setIcon(s1);
				b7.setIcon(star);
			}
		} // end of if

		if (e.getSource() == b8) {
			Icon s1 = b8.getIcon();
			if (b7.getIcon() == star) {
				b7.setIcon(s1);
				b8.setIcon(star);
			} else if (b5.getIcon() == star) {
				b5.setIcon(s1);
				b8.setIcon(star);
			} else if (b9.getIcon() == star) {
				b9.setIcon(s1);
				b8.setIcon(star);
			}

		} // end of if

		if (e.getSource() == b9) {
			Icon s1 = b9.getIcon();
			if (b8.getIcon() == star) {
				b8.setIcon(s1);
				b9.setIcon(star);
			} else if (b6.getIcon() == star) {
				b6.setIcon(s1);
				b9.setIcon(star);
			}
		} // end of if

		// when user will select any button from right side, all the 9 buttons will get
		// new pictures according to the button. for example if user select picture of
		// joy then the left 9 buttons will contain joy's 9 sliced pictures
		if (e.getSource() == sample) {
			// Icon s1 = sample.getIcon();
			// if (s1 == samicon5) {
			// sample.setIcon(samicon1);
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			b5.setIcon(ic5);
			b6.setIcon(ic6);
			b7.setIcon(ic7);
			b8.setIcon(ic8);
			b9.setIcon(ic9);
			star = b9.getIcon();
			starB.setIcon(ic0);
		} // eof if
		else if (e.getSource() == sampleSnaha) {
			// sample.setIcon(samicon2);
			b1.setIcon(ic11);
			b2.setIcon(ic12);
			b3.setIcon(ic13);
			b4.setIcon(ic14);
			b5.setIcon(ic15);
			b6.setIcon(ic16);
			b7.setIcon(ic17);
			b8.setIcon(ic18);
			b9.setIcon(ic19);
			star = b6.getIcon();
			starB.setIcon(ic10);
		} // eof else
		else if (e.getSource() == sampleAfridi) {
			// sample.setIcon(samicon3);
			b1.setIcon(ic21);
			b2.setIcon(ic22);
			b3.setIcon(ic23);
			b4.setIcon(ic24);
			b5.setIcon(ic25);
			b6.setIcon(ic26);
			b7.setIcon(ic27);
			b8.setIcon(ic28);
			b9.setIcon(ic29);
			star = b6.getIcon();
			starB.setIcon(ic20);
		} // eof else
		else if (e.getSource() == sampleKeya) {
			// sample.setIcon(samicon4);
			b1.setIcon(ic31);
			b2.setIcon(ic32);
			b3.setIcon(ic33);
			b4.setIcon(ic34);
			b5.setIcon(ic35);
			b6.setIcon(ic36);
			b7.setIcon(ic37);
			b8.setIcon(ic38);
			b9.setIcon(ic39);
			star = b6.getIcon();
			starB.setIcon(ic30);
		} // eof else
		else if (e.getSource() == sampleMaria) {
			// sample.setIcon(samicon5);
			b1.setIcon(ic41);
			b2.setIcon(ic42);
			b3.setIcon(ic43);
			b4.setIcon(ic44);
			b5.setIcon(ic45);
			b6.setIcon(ic46);
			b7.setIcon(ic47);
			b8.setIcon(ic48);
			b9.setIcon(ic49);
			star = b6.getIcon();
			starB.setIcon(ic40);
		} // eof else

	}// end of actionPerformed

	public static void main(String args[]) {
		new picpuzzle2();
	}// end of main
}// end of class