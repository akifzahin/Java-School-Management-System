package com.Project.Repository;

import java.util.*;

import com.Project.Entities.Student;
import com.Project.Entities.Teacher;
public class Classroom {
private int numberofStudents;
private int numberofTeachers;
private ArrayList<Student> students=new ArrayList<Student>();
private ArrayList<Teacher> teachers=new ArrayList<Teacher>();
public int getNumberofStudents() {
	return numberofStudents;
}

public void setNumberofStudents(int numberofStudents) {
	this.numberofStudents = numberofStudents;
}

public int getNumberofTeachers() {
	return numberofTeachers;
}

public void setNumberofTeachers(int numberofTeachers) {
	this.numberofTeachers = numberofTeachers;
}

public ArrayList<Student> getStudents() {
	return students;
}

public void setStudents(ArrayList<Student> students) {
	this.students = students;
}

public ArrayList<Teacher> getTeachers() {
	return teachers;
}

public void setTeachers(ArrayList<Teacher> teachers) {
	this.teachers = teachers;
}}
