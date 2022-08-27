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
		String info ="--------------------------------------------------Teacher Info----------------------------------------------------"
				+ "\n\n  Name: "+getFullName()+"\n\n  Email: "+getEmail()+"\n\n  Address: "
				+getAddress()+"\n\n  Birth Date: "+getBirthDate()+"\n\n  Age: "+getAge()+"\n\n  Gender: "+getGender()+
				"\n\n  Phone Number: "+getPhoneNumber()+
				"\n\n  Subject: "+getSubject()+"\n\n  Blood Group: "+getBloodGroup()+"\n\n  Designation: "+getDesignation()+
				"\n\n  Years Of Experience: "+getYearsofExperience()
				+"";
		
		return info;
	}
	
	
		
			


	
	
}
