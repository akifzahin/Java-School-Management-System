package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.login.Register;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeUI frame = new WelcomeUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WelcomeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(101, 100, 1094, 684);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCHOOL MANAGEMENT SYSTEM");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(153, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(142, 11, 806, 94);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Account +");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccountSeparationUI  frame = new 	CreateAccountSeparationUI ();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(365, 256, 286, 43);
		contentPane.add(btnNewButton);
		
		JButton btnLoginUser = new JButton("Login User +");
		btnLoginUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginSeparationUI frame = new LoginSeparationUI();
				frame.setVisible(true);
			}
		});
		btnLoginUser.setBackground(new Color(204, 204, 255));
		btnLoginUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLoginUser.setBounds(365, 328, 286, 43);
		contentPane.add(btnLoginUser);
		
		JButton btnExitSystem = new JButton("Exit System");
		btnExitSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExitSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExitSystem.setBackground(new Color(204, 204, 255));
		btnExitSystem.setBounds(365, 403, 286, 43);
		contentPane.add(btnExitSystem);
	}
}
