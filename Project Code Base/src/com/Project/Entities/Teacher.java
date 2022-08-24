package com.Project.Entities;
import java.io.*;
import java.util.*;
import com.Project.Repository.*;


public class Teacher extends User 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 101L;
	private String subject;
	private String designation;
	private int salary;
	private int yearsofExperience;
	private String bloodGroup;
	private Classroom classroom;
	//private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Teacher()
	{
		super();
		
	}


	public Teacher(String fullName,String email, String birthDate, String gender, int age,
			String phoneNumber, String address, String subject, String designation, 
			int yearsofExperience,String bloodGroup ) 
	{
		super(fullName,email, birthDate, gender,age, phoneNumber, address);
		this.subject = subject;
		this.designation = designation;
		this.yearsofExperience = yearsofExperience;
		this.bloodGroup = bloodGroup;
		
	}

	public String getSubject() {
		return subject;
	}
	
	


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getYearsofExperience() {
		return yearsofExperience;
	}

	public void setYearsofExperience(int yearsofExperience) {
		this.yearsofExperience = yearsofExperience;
	}

	
	public String viewInfo() 
	{
		return "Teacher [subject=" + subject + ", designation=" + designation + ", salary=" + salary
				+ ", yearsofExperience=" + yearsofExperience + "]";
	}
	
	public void giveGrades(Student student,char grade)
	{
		
		char[] gradesArray = new char[8];
		
		for(int i=0; i<student.getGradeList().length; i++)
		{
			if(grade == 'A'||grade == 'B'||grade == 'C'||grade == 'D'||grade == 'F')
			{
				gradesArray[i]=grade;
			}
			else
			{
				System.out.println("Invalid Grade!");
				break;
			}
		}
		
		student.setGradeList(gradesArray);

	}
		
			
	public void giveAttendance(Student student,int present, int absent) 
	{
		
		
			
			student.setDaysPresent(present);
			
			student.setDaysAbsent(absent);
	
		
	}
	
	public void serialize(Teacher teacher)
	{
		String name = teacher.getFullName();
		try
		{
			String path = "src\\repository data\\teacherData\\"+name+".ser";
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objOutputStream.writeObject(teacher);
			objOutputStream.close();
			
			fileOutputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();
		}
		
		System.out.println("Successfully Saved Student");
	}

	public Teacher deserialize(Teacher teacher)
	{	
		Teacher teacherObject = null;
		String name = teacher.getFullName();
		try
		{	
			String path = "src\\repository data\\teacherData\\"+name+".ser";
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
			
			teacherObject = (Teacher) objInputStream.readObject();
			
			objInputStream.close();
			fileInputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();

		}
		catch(ClassNotFoundException E)
		{
			System.out.println("Teacher class not found!");
			E.printStackTrace();

		}
		return teacherObject;
		
	}
	
	
	
	
}
