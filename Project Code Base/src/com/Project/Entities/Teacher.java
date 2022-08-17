package com.Project.Entities;
import java.io.*;
import java.util.*;


public class Teacher extends User 
{
	private String subject;
	private String designation;
	private int salary;
	private int yearsofExperience;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Teacher()
	{
		super();
		
	}


	public Teacher(String username, String password, String email, String birthDate, String gender, int age,
			int phoneNumber, Address address, String subject, String designation, int salary, int yearsofExperience,ArrayList<Student> studentList ) 
	{
		super(username, password, email, birthDate, gender, designation, age, phoneNumber, address);
		this.subject = subject;
		this.designation = designation;
		this.salary = salary;
		this.yearsofExperience = yearsofExperience;
		this.studentList = studentList;
		
	}

	public String getSubject() {
		return subject;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}


	public void addtoStudentList(Student student) {
		studentList.add(student);
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
				+ ", yearsofExperience=" + yearsofExperience + ", studentList=" + studentList + "]";
	}
	
	public void giveGrades(Student student)
	{
		
		char[] gradesArray = new char[8];
		
		for(int i=0; i<student.getGradeList().length; i++)
		{
			if()
		}
					

	}
		
			
	public void giveAttendance(Student student) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Days Present: ");
			int present = input.nextInt();
			
			student.setDaysPresent(present);
		
			System.out.println("Enter Days Absent: ");
			int absent = input.nextInt();
			
			student.setDaysAbsent(absent);
	
		
	}
	
	public void serialize(Teacher teacher)
	{
		String name = teacher.getFullName();
		try
		{
			FileOutputStream fileOutputStream = new FileOutputStream("src/teacherData/"+name+".txt");
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objOutputStream.writeObject(teacher);
			objOutputStream.close();
			
			fileOutputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();
		}
	}

	public Teacher deserialize(Teacher teacher)
	{	
		Teacher teacherObject = null;
		String name = teacher.getFullName();
		try
		{
			FileInputStream fileInputStream = new FileInputStream("src/teacherData/"+name+".txt");
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
