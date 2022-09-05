package com.Project.UI.SystemUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Project.UI.StudentUI.CreateAccountUI;
import com.Project.UI.TeacherUI.TeacherCreateAccountUI;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CreateAccountSeparationUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccountSeparationUI frame = new CreateAccountSeparationUI();
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
	public CreateAccountSeparationUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouWantTo = new JLabel("Please select your user type:");
		lblYouWantTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouWantTo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 33));
		lblYouWantTo.setBounds(238, 73, 512, 142);
		contentPane.add(lblYouWantTo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teacher");
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherCreateAccountUI frame = new TeacherCreateAccountUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(428, 221, 144, 51);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Student");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountUI frame = new CreateAccountUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBounds(428, 275, 144, 49);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeUI frame = new WelcomeUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton.setBounds(418, 387, 144, 35);
		contentPane.add(btnNewButton);
	}
}
