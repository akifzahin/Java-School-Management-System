package com.Project.Entities;
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
	
	public void addStudent(Classroom classroom, String name)
	{
		this.classroom = classroom;
		for(int i=0; i<classroom.getStudentList().size(); i++)
		{
			if(classroom.getStudentList().get(i).getFullName() == name)
			{
				Student student = classroom.getStudentList().get(i);
				classroom.deleteFromStudentList(student);
				Classroom.numberofStudents--;
			}
		}
	
	}
	
	public void deleteStudent(Classroom classroom, String name)
	{
		this.classroom = classroom;
		for(int i=0; i<classroom.getStudentList().size(); i++)
		{
			if(classroom.getStudentList().get(i).getFullName() == name)
			{
				Student student = classroom.getStudentList().get(i);
				classroom.deleteFromStudentList(student);
				Classroom.numberofStudents--;
			}
		}
	
	}
	
	public void addTeacher(Classroom classroom, String name)
	{	
		this.classroom = classroom;
		for(int i=0; i<classroom.getTeacherList().size(); i++)
		{
			if(classroom.getTeacherList().get(i).getFullName() == name)
			{
				Teacher teacher = classroom.getTeacherList().get(i);
				classroom.addToTeacherList(teacher);
				Classroom.numberofTeachers++;
			}
		}
	}
	public void deleteTeacher(Classroom classroom, String name)
	{
		this.classroom = classroom;
		for(int i=0; i<classroom.getTeacherList().size(); i++)
		{
			if(classroom.getTeacherList().get(i).getFullName() == name)
			{
				Teacher teacher = classroom.getTeacherList().get(i);
				classroom.deleteFromTeacherList(teacher);
				Classroom.numberofTeachers--;
			}
		}
	
	}
	
	public void searchStudent(Classroom classroom,String name)
	{
		this.classroom = classroom;
		ArrayList<Student> studentArrayList =  new ArrayList<Student>();
		Collections.copy(classroom.getStudentList(), studentArrayList);
		
		for(int i=0; i<studentArrayList.size(); i++)
		{
			if(studentArrayList.get(i).getFullName() == name)
			{
				System.out.println("" +studentArrayList.get(i).viewInfo());
				break;
			}
		}
		
		
		
	}
	
	public void searchTeacher(Classroom classroom, String name)
	{
		this.classroom = classroom;
		ArrayList<Teacher> teacherArrayList =  new ArrayList<Teacher>();
		Collections.copy(classroom.getTeacherList(), teacherArrayList);
		
		for(int i=0; i<teacherArrayList.size(); i++)
		{
			if(teacherArrayList.get(i).getFullName() == name)
			{
				System.out.println("" +teacherArrayList.get(i).viewInfo());
				break;
			}
		}
	}
	
	public void viewStudentInfo(Classroom classroom)
	{
		this.classroom = classroom;
		for(int i=0; i<classroom.getStudentList().size();i++)
		{
			System.out.println("" +classroom.getStudentList().get(i).viewInfo());
		}
	}
	
	public void viewTeacherInfo(Classroom classroom)
	{
		this.classroom = classroom;
		for(int i=0; i<classroom.getTeacherList().size();i++)
		{
			System.out.println("" +classroom.getTeacherList().get(i).viewInfo());
		}
	}

	
	
	

}
