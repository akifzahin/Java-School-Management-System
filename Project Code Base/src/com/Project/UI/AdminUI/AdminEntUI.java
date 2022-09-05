package com.Project.UI.AdminUI;
import com.Project.UI.SystemUI.*;
import com.Project.UI.StudentUI.*;
import com.Project.UI.AdminUI.*;
import com.Project.UI.TeacherUI.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Project.Entities.*;
import com.Project.FileHandling.Deserializer;
import com.Project.Repository.Classroom;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AdminEntUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminEntUI frame = new AdminEntUI();
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
	public AdminEntUI() {
		setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1048, 585);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setForeground(new Color(0, 102, 204));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(269, 10, 478, 78);
		contentPane.add(lblNewLabel);
		
		Classroom classroom = new Classroom();
		Admin admin = new Admin();
		
		JButton btnNewButton = new JButton("Add Teacher");
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = JOptionPane.showInputDialog("Please enter the teacher's name: ");
				String path = "src\\repository data\\teacherData\\"+inputName+".ser";
				File file = new File(path);
				
				if(file.exists())
				{
					
					Teacher teacher = Deserializer.deserializeTeacherFile(file);
					admin.addTeacher(classroom, teacher);
					JOptionPane.showMessageDialog(null, "Teacher added to Classroom!");
							
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Teacher file not found!");
				}
			}
		});
		btnNewButton.setBounds(119, 219, 167, 58);
		contentPane.add(btnNewButton);
		
		JButton btnDeleteTeacher = new JButton("Delete Teacher");
		btnDeleteTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = JOptionPane.showInputDialog("Please enter the teacher's name: ");
				String path = "src\\repository data\\teacherData\\"+inputName+".ser";
				File file = new File(path);
				
				if(file.exists())
				{
					
					Teacher teacher = Deserializer.deserializeTeacherFile(file);
					admin.deleteTeacher(classroom, teacher);
					file.delete();
					JOptionPane.showMessageDialog(null, "Teacher deleted from Classroom!");
							
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Teacher file not found!");
				}
			}
		});
		btnDeleteTeacher.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnDeleteTeacher.setBounds(294, 219, 167, 58);
		contentPane.add(btnDeleteTeacher);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = JOptionPane.showInputDialog("Please enter the student's name: ");
				String path = "src\\repository data\\studentData\\"+inputName+".ser";
				File file = new File(path);
				
				if(file.exists())
				{
					
					Student student = Deserializer.deserializeStudentFile(file);
					admin.addStudent(classroom, student);
					JOptionPane.showMessageDialog(null, "Student added to Classroom!");
							
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Student file not found!");
				}
			}
		});
		btnAddStudent.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnAddStudent.setBounds(524, 219, 167, 58);
		contentPane.add(btnAddStudent);
		
		JButton btnNewButton_2_1 = new JButton("Delete Student");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = JOptionPane.showInputDialog("Please enter the student's name: ");
				String path = "src\\repository data\\studentData\\"+inputName+".ser";
				File file = new File(path);
				
				if(file.exists())
				{
					
					Student student = Deserializer.deserializeStudentFile(file);
					admin.deleteStudent(classroom, student);
					file.delete();
					JOptionPane.showMessageDialog(null, "Student deleted from Classroom!");
							
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Student file not found!");
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(699, 219, 167, 58);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("View Teacher Info");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminViewTeacherInfo frame = new AdminViewTeacherInfo();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnNewButton_2_2.setBounds(294, 286, 167, 58);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("View Student Info");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminViewStudentInfo frame = new AdminViewStudentInfo();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnNewButton_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnNewButton_2_3.setBounds(699, 287, 167, 58);
		contentPane.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(0, 102, 204));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(335, 74, 334, 58);
		lblNewLabel_1.setText(TeacherEntUI.viewDate());
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setForeground(new Color(0, 102, 204));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(335, 123, 334, 58);
		lblNewLabel_1_1.setText(TeacherEntUI.viewTime());
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(56, 10, 322, 190);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/admin1.png"));
		lblNewLabel_2.setIcon(img);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2_2_1 = new JButton("View Teacher Review");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminViewTeacherReview frame = new AdminViewTeacherReview();
				frame.setVisible(true);
				frame.setResizable(false);
				
				
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnNewButton_2_2_1.setBounds(389, 355, 207, 58);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_2_2 = new JButton("Logout");
		btnNewButton_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			AdminLoginUI frame = new AdminLoginUI();
			frame.setVisible(true);
			frame.setResizable(false);
			}
		});
		btnNewButton_2_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton_2_2_2.setBounds(303, 483, 158, 35);
		contentPane.add(btnNewButton_2_2_2);
		
		JButton btnNewButton_2_2_2_1 = new JButton("Home");
		btnNewButton_2_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			WelcomeUI frame = new WelcomeUI();
			frame.setVisible(true);
			frame.setResizable(false);
			
			}
		});
		btnNewButton_2_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton_2_2_2_1.setBounds(511, 483, 158, 35);
		contentPane.add(btnNewButton_2_2_2_1);
		
		JButton btnSearchTeacher_1 = new JButton("Search Student");
		btnSearchTeacher_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminSearchStudent frame = new AdminSearchStudent();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnSearchTeacher_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnSearchTeacher_1.setBounds(524, 287, 167, 58);
		contentPane.add(btnSearchTeacher_1);
		
		JButton btnSearchTeacher = new JButton("Search Teacher");
		btnSearchTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminSearchTeacher frame = new AdminSearchTeacher();
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
		btnSearchTeacher.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnSearchTeacher.setBounds(119, 287, 167, 58);
		contentPane.add(btnSearchTeacher);
	}
}
