package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class teacherFormUI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JTextField address;
	private JTextField birthdate;
	private JTextField age;
	private JTextField gender;
	private JTextField phnnumber;
	private JTextField subject;
	private JTextField id;
	private JTextField deignation;
	private JTextField experience;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherFormUI frame = new teacherFormUI();
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
	public teacherFormUI() {
		setBackground(new Color(102, 153, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 670);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeacherRegistration = new JLabel("TEACHER REGISTRATION");
		lblTeacherRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacherRegistration.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTeacherRegistration.setBounds(104, 24, 345, 27);
		contentPane.add(lblTeacherRegistration);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(39, 423, 102, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I accept all  terms and Conditions");
		rdbtnNewRadioButton_2.setSelected(false);
		rdbtnNewRadioButton_2.setBackground(new Color(153, 204, 255));
		rdbtnNewRadioButton_2.setBounds(109, 584, 228, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(365, 583, 118, 23);
		contentPane.add(btnNewButton);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(184, 92, 228, 27);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Years Of Experience :");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(23, 513, 162, 34);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Designation :");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(39, 468, 102, 34);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Subject :");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_5_1.setBounds(39, 378, 102, 34);
		contentPane.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1 = new JLabel("User Name :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 85, 102, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Email :");
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_6.setBounds(39, 130, 102, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(39, 168, 87, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Birthdate :");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_2.setBounds(39, 205, 102, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(39, 243, 102, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(39, 288, 102, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone Number :");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(39, 333, 135, 34);
		contentPane.add(lblNewLabel_1_3);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(184, 132, 228, 27);
		contentPane.add(email);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(184, 170, 228, 27);
		contentPane.add(address);
		
		birthdate = new JTextField();
		birthdate.setColumns(10);
		birthdate.setBounds(184, 208, 112, 27);
		contentPane.add(birthdate);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(184, 250, 112, 27);
		contentPane.add(age);
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(184, 295, 112, 27);
		contentPane.add(gender);
		
		phnnumber = new JTextField();
		phnnumber.setColumns(10);
		phnnumber.setBounds(184, 340, 228, 27);
		contentPane.add(phnnumber);
		
		subject = new JTextField();
		subject.setColumns(10);
		subject.setBounds(184, 385, 112, 27);
		contentPane.add(subject);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(184, 430, 112, 27);
		contentPane.add(id);
		
		deignation = new JTextField();
		deignation.setColumns(10);
		deignation.setBounds(184, 475, 228, 27);
		contentPane.add(deignation);
		
		experience = new JTextField();
		experience.setColumns(10);
		experience.setBounds(184, 520, 118, 27);
		contentPane.add(experience);
		
		JComboBox comboBoxAuthorGender = new JComboBox();
		comboBoxAuthorGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender.setText(comboBoxAuthorGender.getSelectedItem().toString());
			}
		});
		comboBoxAuthorGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBoxAuthorGender.setFont(new Font("Tahoma", Font.HANGING_BASELINE, 16));
		comboBoxAuthorGender.setForeground(Color.BLACK);
		comboBoxAuthorGender.setBackground(Color.WHITE);
		comboBoxAuthorGender.setBounds(328, 296, 68, 21);
		contentPane.add(comboBoxAuthorGender);
	}
}
