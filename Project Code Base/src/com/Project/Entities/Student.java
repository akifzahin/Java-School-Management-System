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
	private String mathsGrade,scienceGrade,englishGrade;
	
	
	public String getMathsGrade() {
		return mathsGrade;
	}



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
	{String info ="----------------------------------------Student Info--------------------------------------------------"
			+ "\n\n  Name: "+getFullName()+"\n\n  Email: "+getEmail()+"\n\n  Address: "
			+getAddress()+"\n\n  Birth Date: "+getBirthDate()+"\n\n  Age: "+getAge()+"\n\n  Gender: "+getGender()+"\n\n  "
					+ "Phone Number: "+getPhoneNumber()+
			"\n\n  Standard: "+getStandard()+"\n\n  ID: "+getId()+"\n\n  Guardian Name: "+getGuardianName()+"\n\n  Guardian Number: "
		  +getGuardianNumber()+"\n\n Attendance:- \n\n Days Present: " +getDaysPresent()+"\n\n Days Absent: " +getDaysAbsent()+
		  "\n\n Grades: \n\n Maths Grade: "+getMathsGrade() +"\n\n Science Grade: "+getScienceGrade() +"\n\n English Grade: " +getEnglishGrade()+"";
		return info;
	}
	
	
	public void viewAttendance()
	{
		System.out.println("Days Present: " +getDaysPresent() );
		System.out.println("Days Absent: " +getDaysAbsent() );
	}
	
	public void viewResult()
	{
		System.out.println("Your grades:\nMaths: " +getMathsGrade()+"\nScience: "+getScienceGrade()+"\nEnglish: "+getEnglishGrade() );
		
	}
	
	public void setMathsGrade(String mathsGrade) {
		this.mathsGrade = mathsGrade;
	}

	public String getScienceGrade() {
		return scienceGrade;
	}

	public void setScienceGrade(String scienceGrade) {
		this.scienceGrade = scienceGrade;
	}

	public String getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(String englishGrade) {
		this.englishGrade = englishGrade;
	}




}
