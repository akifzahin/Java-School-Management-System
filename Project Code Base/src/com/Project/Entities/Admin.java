package com.Project.Entities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import com.Project.Repository.*;

@SuppressWarnings("serial")
public class Admin extends User
{
	private Classroom classroom;
	
	public Admin()
	{
		super();
	}
	
	public void addStudent(Classroom classroom, Student student)
	{
		classroom.addToStudentList(student);
		Classroom.numberofStudents++;
	
	}
	
	public void deleteStudent(Classroom classroom, Student student)
	{
		classroom.deleteFromStudentList(student);
		Classroom.numberofStudents--;
		
	
	}
	
	public void addTeacher(Classroom classroom, Teacher teacher)
	{	
		classroom.addToTeacherList(teacher);
		Classroom.numberofTeachers++;
	}
	public void deleteTeacher(Classroom classroom, Teacher teacher)
	{
		classroom.deleteFromTeacherList(teacher);
		Classroom.numberofTeachers--;
	
	}
	

	

}
