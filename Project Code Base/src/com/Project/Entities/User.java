package com.Project.Entities;

public class User 
{
	private String username;
	private String password;
	private String email;
	private String birthDate;
	private String gender;
	private int age;
	private int phoneNumber;
	private Address address;
	
	public User(String username, String password, String email, String birthDate, String gender, int age,
			int phoneNumber, Address address) 
	{
		
		this.username = username;
		this.password = password;
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

	public int getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address.toString() + "]";
	}
	
	public void logoutUser()
	{
		
	}
	
	public void exitProgram()
	{
		
	}
	
	
}
