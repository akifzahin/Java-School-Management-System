package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Project.Entities.Student;
import com.Project.FileHandling.Deserializer;
import com.Project.FileHandling.Serializer;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TeacherPublishGrades extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherPublishGrades frame = new TeacherPublishGrades();
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
	public TeacherPublishGrades() {
		setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(8, 10, 609, 425);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name:");
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 42, 177, 44);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(302, 52, 108, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnter = new JLabel("Maths");
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setForeground(new Color(255, 51, 51));
		lblEnter.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblEnter.setBounds(25, 110, 201, 44);
		panel.add(lblEnter);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(302, 120, 108, 33);
		panel.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B","C","D","F"}));
		comboBox.setBounds(482, 125, 70, 21);
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField_1.setText(comboBox.getSelectedItem().toString());
				}
			});
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setBounds(482, 173, 70, 21);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(comboBox_1.getSelectedItem().toString());
			}
		});
		panel.add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(302, 168, 108, 33);
		panel.add(textField_2);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setHorizontalAlignment(SwingConstants.CENTER);
		lblScience.setForeground(new Color(255, 51, 51));
		lblScience.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblScience.setBounds(25, 164, 201, 44);
		panel.add(lblScience);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.setForeground(new Color(255, 51, 51));
		lblEnglish.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblEnglish.setBounds(25, 218, 201, 44);
		panel.add(lblEnglish);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(302, 228, 108, 33);
		panel.add(textField_3);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1_1.setBounds(482, 234, 70, 21);
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText(comboBox_1_1.getSelectedItem().toString());
			}
		});
		panel.add(comboBox_1_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maths = textField_1.getText();
				String science = textField_2.getText();
				String english = textField_3.getText();
				
				String inputName = textField.getText();
				String path = "src\\repository data\\studentData\\"+inputName+".ser";
				File file = new File(path);
				if(file.exists())
				{
					Student student = Deserializer.deserializeStudentFile(file);
					
					student.setMathsGrade(maths);
					student.setEnglishGrade(english);
					student.setScienceGrade(science);
					
					Serializer.serialize(student);
					JOptionPane.showMessageDialog(null, "Successfully Published Grades!");
				
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Student File Not Found!");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton.setBounds(230, 323, 124, 33);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			TeacherEntUI frame = new TeacherEntUI();
			frame.setVisible(true);
			frame.setResizable(false);
			}
		});
		btnBack.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnBack.setBounds(230, 366, 124, 33);
		panel.add(btnBack);
		
	   
		
		
		
		
		
	}




}
