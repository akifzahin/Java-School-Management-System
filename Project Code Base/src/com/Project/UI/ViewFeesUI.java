package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewFeesUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFeesUI frame = new ViewFeesUI();
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
	public ViewFeesUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 606);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 51, 102));
		textArea.setBackground(new Color(255, 255, 153));
		textArea.setBounds(53, 51, 946, 457);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Fees Information");
		lblNewLabel.setForeground(new Color(255, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(396, 11, 201, 28);
		contentPane.add(lblNewLabel);
		Calendar calendar = Calendar.getInstance();
		String[] month = new String[] {"January", "February", "March", "April", "May", "June",
				"July", "August","September", "October", "November", "December" };
		String Month = month[calendar.get(Calendar.MONTH)];
		String msg ="......................................................................."
				+ ".........................................................................."
				+ "..........................................................................."
				+ "..........................................................................."+ 
				"\n\n\t\t*Your Fees for month of "+ Month + " is 12,000 BDT." + "\n\n"
				+ "\t\t* You can Pay your Fees at the following banking system \n\n"+
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
				StudentEntUI frame = new StudentEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(453, 519, 100, 37);
		contentPane.add(btnNewButton);
	}

}
