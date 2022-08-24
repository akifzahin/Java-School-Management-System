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

public class StudentEntUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentEntUI frame = new StudentEntUI();
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
	public StudentEntUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Student!");
		lblNewLabel_2.setForeground(new Color(255, 51, 102));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 40));
		lblNewLabel_2.setBounds(260, 46, 581, 72);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginUI frame = new LoginUI();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(343, 569, 100, 37);
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
		btnNewButton_1.setBounds(545, 569, 100, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(new Color(255, 51, 0));
		btnNewButton_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_2.setBounds(60, 308, 230, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Attendance");
		btnNewButton_3.setForeground(new Color(255, 51, 51));
		btnNewButton_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_3.setBounds(372, 308, 230, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View Grades");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setForeground(new Color(255, 51, 0));
		btnNewButton_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_4.setBounds(670, 308, 235, 59);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3_1 = new JButton("Teacher Review");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3_1.setForeground(new Color(255, 51, 51));
		btnNewButton_3_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton_3_1.setBounds(210, 437, 230, 59);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("View Fees");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		btnNewButton_2_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));

				
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));

		btnNewButton_2_1.setForeground(new Color(255, 51, 51));
		btnNewButton_2_1.setBounds(536, 437, 230, 59);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(17, 71, 273, 207);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/studentphoto.png"));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(255, 0, 51));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(372, 128, 356, 59);
		lblNewLabel_1.setText(TeacherEntUI.viewDate());
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(new Color(255, 0, 51));
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(367, 176, 361, 59);
		lblNewLabel_3.setText(TeacherEntUI.viewTime());
		contentPane.add(lblNewLabel_3);
		
		
	}
}
