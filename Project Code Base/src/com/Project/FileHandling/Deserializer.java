package com.Project.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Project.Entities.Student;
import com.Project.Entities.Teacher;

public class Deserializer {
//	public static Student deserialize(Student student)
//	{	
//		Student studentObject = null;
//		String name = student.getFullName();
//		try
//		{
//			String path = "src\\repository data\\studentData\\"+name+".ser";
//			FileInputStream fileInputStream = new FileInputStream(path);
//			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
//			
//			studentObject = (Student) objInputStream.readObject();
//			
//			objInputStream.close();
//			fileInputStream.close();
//			
//		}
//		catch(IOException E)
//		{
//			E.printStackTrace();
//
//		}
//		catch(ClassNotFoundException E)
//		{
//			System.out.println("Student class not found!");
//			E.printStackTrace();
//
//		}
//		return studentObject;
//		
//	}
	
//	public static Teacher deserialize(Teacher teacher)
//	{	
//		Teacher teacherObject = null;
//		String name = teacher.getFullName();
//		try
//		{	
//			String path = "src\\repository data\\teacherData\\"+name+".ser";
//			FileInputStream fileInputStream = new FileInputStream(path);
//			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
//			
//			teacherObject = (Teacher) objInputStream.readObject();
//			
//			objInputStream.close();
//			fileInputStream.close();
//			
//		}
//		catch(IOException E)
//		{
//			E.printStackTrace();
//
//		}
//		catch(ClassNotFoundException E)
//		{
//			System.out.println("Teacher class not found!");
//			E.printStackTrace();
//
//		}
//		return teacherObject;
//		
//	}
	
	public static Student deserializeStudentFile(File file)
	{	
		Student studentObject = null;
		try
		{
			
			String path = "src\\repository data\\studentData\\"+file.getName();
			FileInputStream fileInputStream = new FileInputStream(path);
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
			
			E.printStackTrace();

		}
		
		return studentObject;
		
	}
	
	public static Teacher deserializeTeacherFile(File file)
	{	
		Teacher teacherObject = null;
		try
		{
			
			String path = "src\\repository data\\teacherData\\"+file.getName();
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
			
			E.printStackTrace();

		}
		
		return teacherObject;
		
	}
	

}
