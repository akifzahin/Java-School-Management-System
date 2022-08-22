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
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(245, 44, 477, 72);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(245, 180, 133, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPassword.setBounds(245, 258, 133, 44);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(393, 186, 263, 38);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(393, 258, 263, 38);
		contentPane.add(passwordField);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("C:\\Users\\h\\Downloads\\User repository\\Teacher repository\\teacher1.txt",true);

					if(textField.getText().equals("") && passwordField.getText().equals("")) {
						JOptionPane.showMessageDialog(btnCreate, "Can't Register :)");
						
					}
					else {
						fw.write(textField.getText()+"\t"+	passwordField.getText()+"\n");
						fw.close();
						JFrame f = new JFrame();
						JOptionPane.showMessageDialog(btnCreate, "Registration Completed Successfully");
						dispose();
						TeacherFormUI frame = new TeacherFormUI();
						frame.setVisible(true);
					}
								
								
							} catch (IOException e1) {
								
								e1.printStackTrace();
							}
			}
		});
		
		btnCreate.setBounds(330, 385, 89, 23);
		contentPane.add(btnCreate);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountSeparationUI frame = new CreateAccountSeparationUI();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(485, 385, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
