package org.student;

import org.department.Department;
public class Student extends Department{
	public void studentname()
	{
		System.out.println("student name is sangeetha");
	}
public void studentdept()
{
	System.out.println("studentdept is CSE");
}
public void studentid()
{
	System.out.println("student id is S0130");
}
public static void main(String[] args) {
	Student details= new Student();
	details.collegename();
	details.collegecode();
	details.collegerank();
	details.deptname();
	details.studentname();
	details.studentdept();
	details.studentid();
	
}
}
