package com.Project.Entities;
import java.io.*;

public abstract class User implements Serializable
{

	private String username;
	private String password;
	private String email;
	private String birthDate;
	private String gender;
	private String fullName;
	private int age;
	private String phoneNumber;
	private String address;
	
	public User()
	{
		this.username = "admin";
		this.password = "password";
	}
	public User(String fullName, String email, String birthDate, String gender, int age,
			String phoneNumber,String address) 
	{
		
		
		this.fullName = fullName;
		this.email = email;
		this.birthDate = birthDate;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getBirthDate() 
	{
		return birthDate;
	}

	public void setBirthDate(String birthDate) 
	{
		this.birthDate = birthDate;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	
	public String printUser() 
	{
		return "username=" + getUsername() + "\npassword=" +getPassword()   + "\nemail=" +  getEmail() + "\nbirthDate="+getBirthDate()  
				+ "\ngender=" + getGender() + "\nage=" + getAge() + "\nphoneNumber=" + getPhoneNumber() + "\naddress=" +getAddress() ;
	}
	
	public void loginUser()
	{
		
		
	}
	public void logoutUser()
	{
		
	}
	
	public void exitProgram()
	{
		
	}
	
	
}
