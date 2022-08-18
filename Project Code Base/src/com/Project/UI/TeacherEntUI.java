package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TeacherEntUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherEntUI frame = new TeacherEntUI();
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
	public TeacherEntUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME TEACHER");
		lblNewLabel_2.setForeground(new Color(255, 51, 102));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(246, 25, 477, 72);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 51, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherLoginUI frame = new TeacherLoginUI();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(339, 559, 89, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(255, 51, 51));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeUI frame = new WelcomeUI();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(560, 559, 89, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Information");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(204, 255, 255));
		btnNewButton_2.setForeground(new Color(255, 51, 51));
		btnNewButton_2.setBounds(76, 289, 230, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Attendence");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setForeground(new Color(255, 51, 51));
		btnNewButton_3.setBounds(393, 289, 230, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("View Salary");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setForeground(new Color(255, 51, 0));
		btnNewButton_2_1.setBounds(562, 429, 230, 59);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("View Student Info");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_1.setForeground(new Color(255, 51, 51));
		btnNewButton_3_1.setBounds(198, 429, 230, 59);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("Publish Grades");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setForeground(new Color(255, 51, 0));
		btnNewButton_4.setBounds(713, 289, 235, 59);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 51, 200, 200);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/teacher1.png"));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
	}
}
