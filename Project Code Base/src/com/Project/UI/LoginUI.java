package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.login.StudentEntities;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 689);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNewLabel.setBounds(272, 231, 133, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Student Login Page");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 40));
		lblNewLabel_2.setBounds(319, 78, 419, 72);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(414, 239, 263, 38);
		contentPane.add(textField);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblPassword.setBounds(272, 286, 133, 44);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(414, 288, 263, 38);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean matched = false;
				String UserId = textField.getText().toString();
				String password = passwordField.getText().toString();
				try {
					FileReader fr = new FileReader(
							"src\\login data\\studentLoginData.txt");
					BufferedReader br = new BufferedReader(fr);
					String str;
					try {
						while ((str = br.readLine()) != null) {
							if (str.equals(UserId + "\t" + password)) {
								matched = true;
								break;
							}
						}
						fr.close();
					} catch (IOException e1) {

						e1.printStackTrace();
					}
				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				}
				if (matched) {
					JOptionPane.showMessageDialog(btnNewButton, "LogIn Successfull !");
					dispose();
					StudentEntUI frame = new StudentEntUI();
					frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Can't LogIn :) " + "Try again!");
				}
			}
			
		});
		btnNewButton.setBounds(414, 400, 113, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeUI frame = new WelcomeUI();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(549, 400, 105, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Sign Up");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountSeparationUI frame = new CreateAccountSeparationUI();
				frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(487, 448, 105, 38);
		contentPane.add(btnNewButton_1_1);
		
	}
}
