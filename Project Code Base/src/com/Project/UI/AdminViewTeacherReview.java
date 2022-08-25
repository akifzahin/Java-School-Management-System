package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminViewTeacherReview extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminViewTeacherReview frame = new AdminViewTeacherReview();
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
	public AdminViewTeacherReview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher Review");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(325, 26, 235, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminEntUI frame = new AdminEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.setBounds(408, 486, 111, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 72, 875, 403);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(65, 105, 225));
		scrollPane.setViewportView(textArea);
		try {
			
			FileReader fr = new FileReader("src\\repository data\\teacherReview.txt");
					
			BufferedReader br = new BufferedReader(fr);
		
			textArea.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
					textArea.read(br,null);
					br.close();
					
					textArea.requestFocus();
				
				fr.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Try again, Error !");
				e1.printStackTrace();
			}
	}
		
	}

