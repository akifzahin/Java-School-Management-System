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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	public TeacherEntUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1059, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Teacher!");
		lblNewLabel_2.setForeground(new Color(255, 51, 102));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 34));
		lblNewLabel_2.setBounds(261, 25, 477, 72);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(255, 51, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherLoginUI frame = new TeacherLoginUI();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(367, 559, 89, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
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
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_2.setBackground(new Color(204, 255, 255));
		btnNewButton_2.setForeground(new Color(255, 51, 51));
		btnNewButton_2.setBounds(76, 289, 230, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Attendance");
		btnNewButton_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_3.setForeground(new Color(255, 51, 51));
		btnNewButton_3.setBounds(393, 289, 230, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("View Salary");
		btnNewButton_2_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_2_1.setForeground(new Color(255, 51, 0));
		btnNewButton_2_1.setBounds(562, 429, 230, 59);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("View Student Info");
		btnNewButton_3_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_3_1.setForeground(new Color(255, 51, 51));
		btnNewButton_3_1.setBounds(226, 429, 230, 59);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("Publish Grades");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_4.setForeground(new Color(255, 51, 0));
		btnNewButton_4.setBounds(713, 289, 235, 59);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 51, 200, 200);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/teacher1.png"));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(255, 0, 51));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel_1.setBounds(261, 107, 477, 36);
		lblNewLabel_1.setText(viewDate());
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(new Color(255, 51, 0));
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(261, 153, 477, 33);
		lblNewLabel_3.setText(viewTime());
		contentPane.add(lblNewLabel_3);
	}

	public static String viewDate()
	{
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy "); 
		
		LocalDateTime now1 = LocalDateTime.now();  
		return "Current Date: " +dtf1.format(now1) ;  

	}
	public static String viewTime()
	{
		
		 
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss "); 
		LocalDateTime now1 = LocalDateTime.now();  
		return " Current Time: " +dtf2.format(now1);  

	}
}

