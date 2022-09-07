package com.employeeWageComputation;

public class EmpWageSwitchCase {
	
	 public int WAGE_PER_HOUR = 20;
	 public int FULL_TIME = 8;
	 public int PART_TIME= 4;
	 public int empWage = 0;

	public void empWageSwitchCase()
	{
	int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
	System.out.println("empCheck = "+empCheck);

	switch(empCheck)
	{
	case 1:                                                            //Present
	   System.out.println("Employee is present");
	   empWage = WAGE_PER_HOUR * FULL_TIME ;
	   break;

	case 2:                                                             //Part-Time
	   System.out.println("Employee working as part time");
	   empWage = WAGE_PER_HOUR * PART_TIME ;
	   break;

	default:
	   System.out.println("Employee is Absent");
	   empWage = 0;

	}
	System.out.println("Employee wage = " +empWage);
	
   }
	public static void main(String[] args)
	{
		EmpWageSwitchCase a = new EmpWageSwitchCase();
		a.empWageSwitchCase();
	}

}

