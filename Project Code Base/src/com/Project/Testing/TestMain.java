package com.Project.Testing;
import com.Project.Repository.*;
import com.Project.Entities.*;
import com.Project.FileHandling.Deserializer;
import com.Project.FileHandling.Serializer;
import java.io.*;

public class TestMain {

	public static void main(String[] args) 
	{
		String path = "src\\repository data\\studentData\\Akif.ser";
		File file = new File(path);
		
		System.out.println("" + Deserializer.deserializeStudentFile(file).printUser());
		

		
		

	}

}
