package com.Project.UI.TeacherUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ViewSalaryUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSalaryUI frame = new ViewSalaryUI();
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
	public ViewSalaryUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 51, 102));
		textArea.setBackground(new Color(204, 255, 255));
		textArea.setBounds(66, 50, 932, 452);
		contentPane.add(textArea);
		Calendar calendar = Calendar.getInstance();
		String[] month = new String[] {"January", "February", "March", "April", "May", "June",
				"July", "August","September", "October", "November", "December" };
		String Month = month[calendar.get(Calendar.MONTH)];
		String msg ="......................................................................."
				+ ".........................................................................."
				+ "..........................................................................."
				+ "..........................................................................."+ 
				"\n\n\t\t*Your Salary for month of "+ Month + " is 75,000 BDT." + "\n\n"
				+ "\t\t* You can withdraw your Salary at the following banking system \n\n"+
				"\t\t\t# Bkash(Mobile Banking)\n\n"
				+ "\t\t\t# SouthEast Bank\n\n"
				+ "\t\t\t# UCL Bank\n\n"
				+ "\t\t\t# Upay(Mobile Banking)\n\n"
				+ "\t\t\t# Bank Asia\n\n"
				+ "\t\t\t# Prime Bank\n\n\n\n\n"
				+ "....................................................."
				+ "......THANK YOU, HAVE A GOOD DAY........................."
				+ "......................................................................"
				+ "........................................................";
		textArea.setFont(new Font("Tahoma",Font.BOLD,16));
		textArea.setText(msg);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherEntUI frame = new TeacherEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(449, 513, 100, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Salary Information");
		lblNewLabel.setForeground(new Color(255, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(377, 11, 201, 28);
		contentPane.add(lblNewLabel);
	}
}
