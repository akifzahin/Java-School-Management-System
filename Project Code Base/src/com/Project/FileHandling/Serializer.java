package com.Project.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.Project.Entities.Student;
import com.Project.Entities.Teacher;

public class Serializer 
{
	public static void serialize(Student student)
	{
		String name = student.getFullName();
		try
		{
			String path = "src\\repository data\\studentData\\"+name+".ser";
			FileOutputStream fileOutputStream = new FileOutputStream(path);
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


	public static void serialize(Teacher teacher)
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
		
		
	}

}
