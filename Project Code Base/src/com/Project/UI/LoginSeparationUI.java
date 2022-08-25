package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LoginSeparationUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSeparationUI frame = new LoginSeparationUI();
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
	public LoginSeparationUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select your user type :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 33));
		lblNewLabel.setBounds(198, 76, 610, 76);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teacher");
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherLoginUI frame = new TeacherLoginUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(431, 222, 144, 51);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Student");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginUI frame = new LoginUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		rdbtnNewRadioButton_1.setBounds(431, 276, 144, 49);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Admin");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLoginUI frame = new AdminLoginUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		rdbtnNewRadioButton_2.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		rdbtnNewRadioButton_2.setBounds(431, 327, 144, 51);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeUI frame = new WelcomeUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton.setBounds(431, 422, 124, 37);
		contentPane.add(btnNewButton);
	}
}
