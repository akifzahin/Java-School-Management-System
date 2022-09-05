package com.Project.UI.StudentUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Project.Entities.Student;
import com.Project.FileHandling.Deserializer;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class StudentViewAttendance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentViewAttendance frame = new StudentViewAttendance();
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
	public StudentViewAttendance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Student Attendance");
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(8, 10, 600, 353);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Days Present:");
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		lblNewLabel.setBounds(57, 117, 197, 47);
		panel.add(lblNewLabel);
		
		JLabel lblDaysAbsent = new JLabel("Days Absent:");
		lblDaysAbsent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysAbsent.setForeground(new Color(255, 51, 51));
		lblDaysAbsent.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 20));
		lblDaysAbsent.setBounds(57, 174, 197, 47);
		panel.add(lblDaysAbsent);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textField.setForeground(Color.RED);
		textField.setBounds(264, 128, 121, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textField_1.setForeground(Color.RED);
		textField_1.setColumns(10);
		textField_1.setBounds(264, 185, 121, 29);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentEntUI frame = new StudentEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton.setBounds(329, 267, 121, 29);
		panel.add(btnNewButton);
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterName.setForeground(new Color(255, 51, 51));
		lblEnterName.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
		lblEnterName.setBounds(57, 59, 197, 47);
		panel.add(lblEnterName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		textField_2.setForeground(Color.RED);
		textField_2.setColumns(10);
		textField_2.setBounds(264, 71, 121, 29);
		panel.add(textField_2);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String inputName = textField_2.getText();
			String path = "src\\repository data\\studentData\\"+inputName+".ser";
			File file = new File(path);
			
			if(file.exists())
			{
				Student student = Deserializer.deserializeStudentFile(file);
				textField.setText(""+student.getDaysPresent());
				textField_1.setText(""+student.getDaysAbsent());
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Can't find your information!");
			}
		}
		});
		btnView.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnView.setBounds(153, 267, 121, 29);
		panel.add(btnView);
	}
}
