package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TeacherLoginUI extends JFrame {

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
					TeacherLoginUI frame = new TeacherLoginUI();
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
	public TeacherLoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1035, 647);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Teacher Login Page");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 40));
		lblNewLabel_2.setBounds(213, 91, 559, 72);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNewLabel.setBounds(273, 233, 133, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblPassword.setBounds(273, 294, 133, 44);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(433, 242, 263, 38);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(433, 303, 263, 38);
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
							"src\\login data\\teacherLoginData.txt");
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
					TeacherEntUI frame = new TeacherEntUI();
					frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Can't LogIn :) " + "Try again!");
				}
			
			}
		});
		btnNewButton.setBounds(433, 415, 98, 38);
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
		btnNewButton_1.setBounds(555, 415, 98, 38);
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
		btnNewButton_1_1.setBounds(499, 487, 98, 38);
		contentPane.add(btnNewButton_1_1);
	}
}
