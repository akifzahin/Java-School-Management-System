package com.Project.Entities;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;

public class Student extends User implements Serializable {
	private String standard;
	private String guardianName;
	private int guardianNumber;
	private int id;
	private ArrayList<String> gradeList;



	public Student(String username, String password, String email, String birthDate, String gender, int age,
			int phoneNumber, Address address, String standard, String guardianName, int guardianNumber, int id
			) {
		super(username, password, email, birthDate, gender, age, phoneNumber);
		this.standard = standard;
		this.guardianName = guardianName;
		this.guardianNumber = guardianNumber;
		this.id = id;
		//gradeList = null;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getGuardianNmae() {
		return guardianName;
	}

	public void setGuardianNmae(String guardianNmae) {
		this.guardianName = guardianNmae;
	}

	public int getGuardianNumber() {
		return guardianNumber;
	}

	public void setGuardianNumber(int guardianNumber) {
		this.guardianNumber = guardianNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<String> getGradeList() {
		return gradeList;
	}

	public void setGradeList(ArrayList<String> gradeList) {
		this.gradeList = gradeList;
	}

	public void viewAttendence() {

	}

	public void viewResult() {

	}

	public void getdate() {

	}

	public String getMonth() {

		Calendar calendar = Calendar.getInstance();
		String[] month = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		return month[calendar.get(Calendar.MONTH)];

	}

	public String  viewfees() {
		return "Your fees for " + getMonth() + "is 5000 BDT";
	}

	public void teacherReview() {

	}

	
	public String viewInfo() {
		return printUser() +"\nstandard="+standard+"\nguardianName="+guardianName+"\nguardianNumber=" + guardianNumber
				+"\nid=" +id+"\nStudent Fees ="+viewfees()+"\ngradeList="+gradeList;
	}


	
	

}
