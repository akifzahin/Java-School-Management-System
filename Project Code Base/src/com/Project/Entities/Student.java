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
	{String info ="----------------------------------------Student Info--------------------------------------------------"
			+ "\n\n  Name: "+getFullName()+"\n\n  Email: "+getEmail()+"\n\n  Address: "
			+getAddress()+"\n\n  Birth Date: "+getBirthDate()+"\n\n  Age: "+getAge()+"\n\n  Gender: "+getGender()+"\n\n  "
					+ "Phone Number: "+getPhoneNumber()+
			"\n\n  Standard: "+getStandard()+"\n\n  ID: "+getId()+"\n\n  Guardian Name: "+getGuardianName()+"\n\n  Guardian Number: "
		  +getGuardianNumber()
			+"";
		return info;
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
	
	




}
