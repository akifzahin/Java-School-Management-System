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
		setBounds(600, 200, 700, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(8, 10, 670, 513);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtEnterName = new JTextField();
		txtEnterName.setForeground(new Color(255, 51, 102));
		txtEnterName.setBackground(new Color(255, 255, 204));
		txtEnterName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEnterName.setBounds(274, 22, 160, 27);
		panel.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Name :");
		lblNewLabel.setForeground(new Color(255, 51, 102));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(122, 15, 160, 37);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 120, 654, 339);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 51, 102));
		textArea.setBackground(new Color(255, 255, 153));
		textArea.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_2 = new JButton("View");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton_2.setBounds(304, 59, 98, 33);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentEntUI frame = new StudentEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(304, 470, 98, 33);
		panel.add(btnNewButton_1_1);
		
		
	}
}
