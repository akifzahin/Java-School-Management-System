package com.Project.UI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.Project.Entities.*;
import com.Project.FileHandling.Serializer;

public class teacherFormUI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JTextField address;
	private JTextField birthdate;
	private JTextField age;
	private JTextField gender;
	private JTextField phonenumber;
	private JTextField subject;
	private JTextField bloodgroup;
	private JTextField designation;
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
	public teacherFormUI() {
		setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 670);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeacherRegistration = new JLabel("TEACHER REGISTRATION");
		lblTeacherRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacherRegistration.setFont(new Font("Microsoft JhengHei", Font.BOLD, 23));
		lblTeacherRegistration.setBounds(124, 24, 345, 27);
		contentPane.add(lblTeacherRegistration);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Blood Group:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(39, 423, 102, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I accept all the Terms and Conditions.");
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setSelected(false);
		rdbtnNewRadioButton_2.setBackground(new Color(204, 255, 255));
		rdbtnNewRadioButton_2.setBounds(39, 584, 298, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userFullName = name.getText();
				String userEmail = email.getText();
				String userAddress = address.getText();
				String userBirthDate = birthdate.getText();
				int userAge = Integer.parseInt(age.getText());
				String userGender = gender.getText();
				String userPhoneNumber = phonenumber.getText();
				String userSubject = subject.getText();
				String userBloodGroup = bloodgroup.getText();
				String userDesignation = designation.getText();
				int userYearsOfExperience = Integer.parseInt(experience.getText());
				
				Teacher teacher = new Teacher(userFullName,userEmail,userBirthDate,userGender,userAge,
						userPhoneNumber,userAddress,userSubject,userDesignation,
						userYearsOfExperience,userBloodGroup);
				Serializer.serialize(teacher);
				
				Component btnCreate = null;
				JOptionPane.showMessageDialog(btnCreate, "Welcome " +userFullName+"!");
				dispose();
				TeacherEntUI frame = new TeacherEntUI();
				frame.setVisible(true);
				
//				if(name.getText().isBlank() || email.getText().isBlank()|| address.getText().isBlank()|| birthdate.getText().isBlank()||
//						age.getText().isBlank()|| gender.getText().isBlank()|| phonenumber.getText().isBlank()|| subject.getText().isBlank()||
//						bloodgroup.getText().isBlank()|| designation.getText().isBlank() || experience.getText().isBlank() )
//				{
//					JOptionPane.showMessageDialog(null, "Please complete the entire form.");
//				}
				
				
	
				
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
		
		JLabel lblNewLabel_1 = new JLabel("Full Name :");
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
		
		phonenumber = new JTextField();
		phonenumber.setColumns(10);
		phonenumber.setBounds(184, 340, 228, 27);
		contentPane.add(phonenumber);
		
		subject = new JTextField();
		subject.setColumns(10);
		subject.setBounds(184, 385, 112, 27);
		contentPane.add(subject);
		
		bloodgroup = new JTextField();
		bloodgroup.setColumns(10);
		bloodgroup.setBounds(184, 430, 112, 27);
		contentPane.add(bloodgroup);
		
		designation = new JTextField();
		designation.setColumns(10);
		designation.setBounds(184, 475, 228, 27);
		contentPane.add(designation);
		
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
		comboBoxAuthorGender.setBounds(328, 296, 84, 21);
		contentPane.add(comboBoxAuthorGender);
	}
}
