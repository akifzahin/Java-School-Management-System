package com.Project.UI.AdminUI;

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
import java.awt.SystemColor;

public class AdminSearchStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSearchStudent  frame = new AdminSearchStudent ();
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
	public AdminSearchStudent () {
		setTitle("Search Student Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 700, 573);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(8, 10, 670, 513);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtEnterName = new JTextField();
		txtEnterName.setForeground(SystemColor.textHighlight);
		txtEnterName.setBackground(SystemColor.inactiveCaption);
		txtEnterName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEnterName.setBounds(299, 22, 160, 27);
		panel.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Student Name :");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(55, 15, 227, 37);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 120, 654, 339);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(SystemColor.textHighlight);
		textArea.setBackground(SystemColor.inactiveCaption);
		textArea.setFont(new Font("Tahoma", Font.BOLD, 15));
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
		btnNewButton_2.setBounds(274, 64, 98, 33);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminEntUI frame = new AdminEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(274, 470, 98, 33);
		panel.add(btnNewButton_1_1);
		
		
	}
}
