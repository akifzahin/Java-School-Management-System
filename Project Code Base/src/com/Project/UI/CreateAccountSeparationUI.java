package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;

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
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouWantTo = new JLabel("You want to create account as :");
		lblYouWantTo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblYouWantTo.setBounds(301, 95, 526, 37);
		contentPane.add(lblYouWantTo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teacher");
		rdbtnNewRadioButton.setBounds(422, 210, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Student");
		rdbtnNewRadioButton_1.setBounds(422, 270, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}

}
