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
import java.io.FileWriter;
import java.io.IOException;
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
		lblNewLabel_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(39, 423, 102, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I accept all the Terms and Conditions.");
		rdbtnNewRadioButton_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		rdbtnNewRadioButton_2.setSelected(false);
		rdbtnNewRadioButton_2.setBackground(new Color(204, 255, 255));
		rdbtnNewRadioButton_2.setBounds(39, 584, 298, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	
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

				if(name.getText().equals("") || email.getText().equals("")|| address.getText().equals("")|| birthdate.getText().equals("")||
						age.getText().equals("")|| gender.getText().equals("")|| phonenumber.getText().equals("")|| subject.getText().equals("")||
						bloodgroup.getText().equals("")|| designation.getText().equals("") || experience.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "Please complete the entire form.");
				}
				else {
				Teacher teacher = new Teacher(userFullName,userEmail,userBirthDate,userGender,userAge,
						userPhoneNumber,userAddress,userSubject,userDesignation,
						userYearsOfExperience,userBloodGroup);
				Serializer.serialize(teacher);
				
				Component btnCreate = null;
				JOptionPane.showMessageDialog(btnCreate, "Welcome " +userFullName+"!");
				dispose();
				TeacherEntUI frame = new TeacherEntUI();
				frame.setVisible(true);
				frame.setResizable(false);
				}
			}catch(NumberFormatException e1) 
			{	
				JOptionPane.showMessageDialog(null, "Please complete the entire form.");
				e1.printStackTrace();
			}
			try {
				
				//write data into Teacher file 
				FileWriter fw = new FileWriter("src\\repository data\\TeacherDatabase.txt",true);
				fw.write("---------------------------------------------------------------------------------------------"
						+ "--------------------------------------------------------------------------------------------"+"\n\n");
				fw.write(" Teacher Name : "+name .getText() + "\n\n");
				fw.write(" Email : "+ email.getText() + "\n\n");
				fw.write(" Address : "+ address.getText() + "\n\n");
				fw.write(" BirthDate : "+birthdate.getText() + "\n\n");
				fw.write(" Age  : "+ age.getText() + "\n\n");
				fw.write(" Gender : "+gender.getText() + "\n\n");
				
				fw.write(" PhoneNumber: "+ phonenumber.getText() + "\n\n");
				fw.write(" Subject : "+subject.getText()  + "\n\n");
				fw.write(" Blood Group : "+ bloodgroup.getText()+ "\n\n");
				fw.write(" Designation : "+designation.getText()   + "\n\n");
				fw.write(" Years Of Experience : "+experience.getText() + "\n\n");
				fw.write("---------------------------------------------------------------------------------------------"
						+ "---------------------------------------------------------------------------------------------"+"\n");
				fw.close();
				//JOptionPane.showMessageDialog(null, " Added Information to Teacher Database ");	
			} catch (IOException e1) {
				//JOptionPane.showMessageDialog(null, "can't add info to Teacher Database ");				
				e1.printStackTrace();
			}
	
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(365, 583, 118, 23);
		contentPane.add(btnNewButton);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 15));
		name.setColumns(10);
		name.setBounds(184, 92, 228, 27);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Years Of Experience :");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_3_2.setBounds(23, 513, 162, 34);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Designation :");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(39, 468, 102, 34);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Subject :");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_5_1.setBounds(39, 378, 102, 34);
		contentPane.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1.setBounds(39, 85, 102, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Email :");
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_6.setBounds(39, 130, 102, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_3.setBounds(39, 168, 87, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Birthdate :");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_2.setBounds(39, 205, 102, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(39, 243, 102, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(39, 288, 102, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone Number :");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(39, 333, 135, 34);
		contentPane.add(lblNewLabel_1_3);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.BOLD, 15));
		email.setColumns(10);
		email.setBounds(184, 132, 228, 27);
		contentPane.add(email);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.BOLD, 15));
		address.setColumns(10);
		address.setBounds(184, 170, 228, 27);
		contentPane.add(address);
		
		birthdate = new JTextField();
		birthdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		birthdate.setColumns(10);
		birthdate.setBounds(184, 208, 112, 27);
		contentPane.add(birthdate);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 15));
		age.setColumns(10);
		age.setBounds(184, 250, 112, 27);
		contentPane.add(age);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		gender.setColumns(10);
		gender.setBounds(184, 295, 112, 27);
		contentPane.add(gender);
		
		phonenumber = new JTextField();
		phonenumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		phonenumber.setColumns(10);
		phonenumber.setBounds(184, 340, 228, 27);
		contentPane.add(phonenumber);
		
		subject = new JTextField();
		subject.setFont(new Font("Tahoma", Font.BOLD, 15));
		subject.setColumns(10);
		subject.setBounds(184, 385, 112, 27);
		contentPane.add(subject);
		
		bloodgroup = new JTextField();
		bloodgroup.setFont(new Font("Tahoma", Font.BOLD, 15));
		bloodgroup.setColumns(10);
		bloodgroup.setBounds(184, 430, 112, 27);
		contentPane.add(bloodgroup);
		
		designation = new JTextField();
		designation.setFont(new Font("Tahoma", Font.BOLD, 15));
		designation.setColumns(10);
		designation.setBounds(184, 475, 228, 27);
		contentPane.add(designation);
		
		experience = new JTextField();
		experience.setFont(new Font("Tahoma", Font.BOLD, 15));
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
