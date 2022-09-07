package com.employeeWageComputation;

public class EmployeeAttendanceComputation
{
	
public int IS_FULL_TIME = 1;
	
	public void getAttendance() 
	{

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
		   System.out.println("Employee is present");
		else
		   System.out.println("Employee is Absent");
     }

	public static void main(String[] args)
	{
		EmployeeAttendanceComputation emp = new EmployeeAttendanceComputation();
		emp.getAttendance();
		// TODO Auto-generated method stub

	}

}
