package com.Project.Entities;
import java.io.*;
import java.util.*;

public class Student extends User 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	private String standard;
	private String guardianName;
	private String guardianNumber;
	private String id;
	private int daysPresent;
	private int daysAbsent;
	private char[] gradeList;
	
	
	public Student()
	{
		super();
	}
	
	public Student(String fullName)
	{
		
	}
	


	public Student(String email, String birthDate, String gender, String fullName,int age,
			String phoneNumber, String address, String standard, String guardianName, String guardianNumber, String id)
	{
		super(email, birthDate, gender,fullName, age, phoneNumber, address);
		this.standard = standard;
		this.guardianName = guardianName;
		this.guardianNumber = guardianNumber;
		this.id = id;
		gradeList = new char[8];
	}



	public String getStandard() {
		return standard;
	}



	public void setStandard(String standard) {
		this.standard = standard;
	}



	public String getGuardianName() {
		return guardianName;
	}



	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}



	public String getGuardianNumber() {
		return guardianNumber;
	}



	public void setGuardianNumber(String guardianNumber) {
		this.guardianNumber = guardianNumber;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}
	
	
	public char[] getGradeList() {
		return gradeList;
	}
	
	public String printGradeList()
	{
		return gradeList.toString();
	}
	
	public void setGradeList(char[] gradeList) {
		this.gradeList = gradeList;
	}



	public int getDaysPresent() {
		return daysPresent;
	}
	
	public void printAttendance()
	{
		System.out.println("Days Present: " +daysPresent+"\nDays Absent: " +daysAbsent);
	}


	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}



	public int getDaysAbsent() 
	{
		return daysAbsent;
	}



	public void setDaysAbsent(int daysAbsent) {
		this.daysAbsent = daysAbsent;
	}



	public String viewInfo() 
	{
		return "Student [standard=" + standard + ", guardianName=" + guardianName + ", guardianNumber=" + guardianNumber
				+ ", id=" + id + ", gradeList=" + gradeList + "]" +super.toString();
	}
	
	public void viewFees()
	{
		Formatter fmt = new Formatter();
		Calendar date1 = Calendar.getInstance();
		
		fmt = new Formatter();
		fmt.format("%tB",date1);
		System.out.println("Your fees for the month of " +fmt+ " is: 13000");
		
	}
	public void viewAttendance()
	{
		System.out.println("Days Present: " +getDaysPresent() );
		System.out.println("Days Absent: " +getDaysAbsent() );
	}
	
	public void viewResult()
	{
		System.out.println("Your grades: " +gradeList.toString() );
	}
	
	public void serialize(Student student)
	{
		String name = student.getFullName();
		try
		{
			FileOutputStream fileOutputStream = new FileOutputStream("src/studentData/"+name+".txt");
			ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objOutputStream.writeObject(student);
			objOutputStream.close();
			
			fileOutputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();
		}
	}

	public Student deserialize(Student student)
	{	
		Student studentObject = null;
		String name = student.getFullName();
		try
		{
			FileInputStream fileInputStream = new FileInputStream("src/studentData/"+name+".txt");
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
			
			studentObject = (Student) objInputStream.readObject();
			
			objInputStream.close();
			fileInputStream.close();
			
		}
		catch(IOException E)
		{
			E.printStackTrace();

		}
		catch(ClassNotFoundException E)
		{
			System.out.println("Student class not found!");
			E.printStackTrace();

		}
		return studentObject;
		
	}




}
