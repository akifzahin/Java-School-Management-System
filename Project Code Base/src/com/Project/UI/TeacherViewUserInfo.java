package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Project.FileHandling.Deserializer;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class TeacherViewUserInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherViewUserInfo frame = new TeacherViewUserInfo();
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
	public TeacherViewUserInfo() {
		setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Teacher View Information");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(8, 10, 733, 458);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name:");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(51, 24, 278, 62);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(448, 46, 140, 28);
		panel.add(textField);
		textField.setColumns(10);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 137, 733, 321);
		panel.add(scrollPane);
	
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(new Color(204, 255, 255));
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = "src\\repository data\\teacherData\\" +textField.getText()+".ser";
				File file = new File(path);
				if(file.exists())
				{
					textArea.setText("" + Deserializer.deserializeTeacherFile(file).viewInfo());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Can't find your information!");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton.setBounds(404, 85, 98, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TeacherEntUI frame = new TeacherEntUI();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton_1.setBounds(522, 85, 98, 33);
		panel.add(btnNewButton_1);
		
	}

}
