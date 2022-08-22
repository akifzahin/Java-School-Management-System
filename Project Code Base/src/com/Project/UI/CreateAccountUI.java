package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.login.StudentInfoForm;
import com.login.TeacherInfoForm;

//import com.login.TeacherInfoForm;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CreateAccountUI extends JFrame {

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
					CreateAccountUI frame = new CreateAccountUI();
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
	public CreateAccountUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 684);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student Account Creation ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 35));
		lblNewLabel_2.setBounds(298, 88, 477, 72);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNewLabel.setBounds(276, 217, 133, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblPassword.setBounds(276, 289, 133, 44);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(435, 226, 263, 38);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(435, 297, 263, 38);
		contentPane.add(passwordField);
		
		JButton btnCreate = new JButton("Next");
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String filePath = "src\\login data\\studentLoginData.txt";
					FileWriter fw = new FileWriter(filePath,true);

					if(textField.getText().equals("") || passwordField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill up the required fields.");
						
					}
					else {
						fw.write("Username: "+textField.getText()+"\nPassword: "+	passwordField.getText()+"\n");
						fw.close();
						JFrame f = new JFrame();
						JOptionPane.showMessageDialog(btnCreate, "Please proceed to the Registration Page.");
						dispose();
						StudentFormUI frame = new StudentFormUI();
						frame.setVisible(true);
						}
								
								
					} catch (IOException e1) 
							{
								
								e1.printStackTrace();
							}
					
					
			}
		});
		btnCreate.setBounds(435, 392, 109, 38);
		contentPane.add(btnCreate);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountSeparationUI frame = new CreateAccountSeparationUI();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(563, 392, 124, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Homepage");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeUI frame = new WelcomeUI();
				frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(493, 473, 124, 38);
		contentPane.add(btnNewButton_1_1);
	}
}
