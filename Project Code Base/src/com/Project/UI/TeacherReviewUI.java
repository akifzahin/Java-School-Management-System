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
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TeacherReviewUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherReviewUI frame = new TeacherReviewUI();
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
	public TeacherReviewUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1044, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher Review Section");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(353, 21, 281, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("*Teacher Name : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(117, 84, 138, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*Subject :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(117, 128, 82, 20);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setBounds(266, 80, 156, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setBounds(266, 124, 156, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 204));
		textArea.setBounds(117, 196, 827, 289);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel(" *Write Your Review :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(111, 165, 197, 20);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = "src\\repository data\\teacherReview.txt";
				File obj = new File (filePath);
				try {
					FileWriter fr = new FileWriter (obj,true);
					fr.write("............................................................................................"
							+ "............................................................................................"+"\n");
					fr.write(" Teacher Name :" +textField .getText()+"\n\n");
					fr.write(" Subject      : " +textField_1 .getText()+"\n\n");
					fr.write(" Review :  "+textArea.getText()+"\n");
					fr.write(" - By Anonymous."+"\n");
					fr.write("........................................................................................."
							+ "......................................................................................"+"\n");
					fr.close();
					JOptionPane.showMessageDialog(btnNewButton, "Review Submitted !");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(btnNewButton, "Can't submit:) Try again");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(397, 504, 116, 30);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentEntUI frame = new StudentEntUI();
				frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(543, 504, 116, 30);
		contentPane.add(btnBack);
		
	}
}
