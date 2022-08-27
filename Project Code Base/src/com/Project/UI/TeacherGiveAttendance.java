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

public class TeacherGiveAttendance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherGiveAttendance frame = new TeacherGiveAttendance();
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
	public TeacherGiveAttendance() {
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
		
		JLabel lblNewLabel = new JLabel("Enter Name :");
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 69, 177, 44);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setBounds(225, 77, 164, 33);
		textField.setFont(new Font("TAHOMA", Font.BOLD, 15));
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnter = new JLabel("Days Present :");
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setForeground(new Color(255, 51, 51));
		lblEnter.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblEnter.setBounds(14, 111, 201, 44);
		panel.add(lblEnter);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("TAHOMA", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(225, 119, 108, 33);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.RED);
		textField_2.setFont(new Font("TAHOMA", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(225, 165, 108, 33);
		panel.add(textField_2);
		
		JLabel lblScience = new JLabel("Days Absent :");
		lblScience.setHorizontalAlignment(SwingConstants.CENTER);
		lblScience.setForeground(new Color(255, 51, 51));
		lblScience.setFont(new Font("Microsoft JhengHei", Font.BOLD, 19));
		lblScience.setBounds(10, 157, 201, 44);
		panel.add(lblScience);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String present = textField_1.getText();
				String absent = textField_2.getText();
				
				
				String inputName = textField.getText();
				String path = "src\\repository data\\studentData\\"+inputName+".ser";
				File file = new File(path);
				if(file.exists())
				{
					Student student = Deserializer.deserializeStudentFile(file);
					
					student.setDaysPresent(Integer.parseInt(present));
					student.setDaysAbsent(Integer.parseInt(absent));
					
					
					Serializer.serialize(student);
					JOptionPane.showMessageDialog(null, "Successfully Published Attendance!");
				
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Student File Not Found!");
				}
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton.setBounds(215, 278, 124, 33);
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
		btnBack.setBounds(215, 332, 124, 33);
		panel.add(btnBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2","3","4","5","6","7","8","9","10","11"
				,"12","13","14","15","16","17","18","19","20","21"
				,"22","23","24","25","26","27","28","29","30"
		}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(362, 125, 70, 21);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(comboBox_1.getSelectedItem().toString());
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2","3","4","5","6","7","8","9","10","11"
				,"12","13","14","15","16","17","18","19","20","21"
				,"22","23","24","25","26","27","28","29","30"
		}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setBounds(362, 180, 70, 21);
		panel.add(comboBox_1);
		
	   
		
		
		
		
		
	}
}
