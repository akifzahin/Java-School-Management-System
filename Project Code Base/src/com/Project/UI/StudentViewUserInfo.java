package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Project.FileHandling.Deserializer;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class StudentViewUserInfo extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentViewUserInfo frame = new StudentViewUserInfo();
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
	public StudentViewUserInfo() {
		setTitle("View Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 700, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(8, 10, 670, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtEnterName = new JTextField();
		txtEnterName.setBounds(378, 24, 126, 27);
		panel.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Name:");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 10, 167, 50);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 120, 654, 339);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 153));
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = "src\\repository data\\studentData\\" +txtEnterName.getText()+".ser";
				File file = new File(path);
				if(file.exists())
				{
					textArea.setText("" + Deserializer.deserializeStudentFile(file).viewInfo());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Can't find your information!");
				}
			}
		});
		btnNewButton.setBounds(353, 75, 83, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(460, 75, 83, 21);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentEntUI frame = new StudentEntUI();
				frame.setVisible(true);
			}
		});
		
		
	}
}
