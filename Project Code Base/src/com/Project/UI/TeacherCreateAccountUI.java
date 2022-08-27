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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TeacherCreateAccountUI extends JFrame {

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
					TeacherCreateAccountUI frame = new TeacherCreateAccountUI();
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
	public TeacherCreateAccountUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1042, 622);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Teacher Account Creation ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 35));
		lblNewLabel_2.setBounds(252, 51, 477, 72);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNewLabel.setBounds(245, 180, 133, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblPassword.setBounds(245, 258, 133, 44);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(393, 186, 263, 38);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(393, 258, 263, 38);
		contentPane.add(passwordField);
		
		JButton btnCreate = new JButton("Next");
		btnCreate.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String filePath = "src\\login data\\teacherLoginData.txt";
					FileWriter fw = new FileWriter(filePath,true);

					if(textField.getText().equals("") || passwordField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill up the required fields.");
						
					}
					else {
						fw.write(textField.getText()+"\t"+	passwordField.getText()+"\n");
						fw.close();
						JFrame f = new JFrame();
						JOptionPane.showMessageDialog(btnCreate, "Please proceed to the Registration Page.");
						dispose();
						teacherFormUI frame = new teacherFormUI();
						frame.setVisible(true);
						frame.setResizable(false);
						}
								
								
					} catch (IOException e1) 
							{
								
								e1.printStackTrace();
							}
					
					
			}
		});
		
		btnCreate.setBounds(393, 349, 110, 44);
		contentPane.add(btnCreate);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountSeparationUI frame = new CreateAccountSeparationUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton_1.setBounds(542, 349, 114, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Homepage");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeUI frame = new WelcomeUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(464, 423, 124, 38);
		contentPane.add(btnNewButton_1_1);
	}

}
