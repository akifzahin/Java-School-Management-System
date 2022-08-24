package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Formatter;
import java.awt.event.ActionEvent;

public class WelcomeUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeUI frame = new WelcomeUI();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WelcomeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(101, 100, 1094, 684);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome User!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(153, 51, 102));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 45));
		lblNewLabel.setBounds(137, 218, 806, 94);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Account ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountSeparationUI  frame = new 	CreateAccountSeparationUI ();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnNewButton.setBounds(389, 322, 286, 43);
		contentPane.add(btnNewButton);
		
		JButton btnLoginUser = new JButton("Login User ");
		btnLoginUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginSeparationUI frame = new LoginSeparationUI();
				frame.setVisible(true);
			}
		});
		btnLoginUser.setBackground(new Color(204, 204, 255));
		btnLoginUser.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnLoginUser.setBounds(389, 375, 286, 43);
		contentPane.add(btnLoginUser);
		
		JButton btnExitSystem = new JButton("Exit System");
		btnExitSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExitSystem.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnExitSystem.setBackground(new Color(204, 204, 255));
		btnExitSystem.setBounds(389, 428, 286, 43);
		contentPane.add(btnExitSystem);
		
		JLabel lblNewLabel_1 = new JLabel("");

		ImageIcon img = new ImageIcon(this.getClass().getResource("/schoolLogo1.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(img);
		lblNewLabel_1.setBounds(325, 20, 409, 177);
		contentPane.add(lblNewLabel_1);

		
		
		
	}

	public static String viewDateandTime()
	{
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy "); 
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss "); 
		LocalDateTime now1 = LocalDateTime.now();  
		return "Current Date: " +dtf1.format(now1) +" Current Time: " +dtf2.format(now1);  

	}
}
