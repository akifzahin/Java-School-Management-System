package com.Project.Testing;
import com.Project.Repository.*;
import com.Project.FileHandling.*;
import com.Project.Entities.*;

public class TestMain {

	public static void main(String[] args) 
	{
		Student st1 = new Student();
		st1.viewFees();
		
		Teacher t1 = new Teacher();
		t1.addtoStudentList(st1);
		
//		t1.giveAttendance(st1);
//		st1.printAttedance();
		
//		t1.giveGrades(st1);
//		st1.printGradeList();
	}

}
