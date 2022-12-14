package com.employeeWageComputation;

public class EmpWageMultiCompaniesObject {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_OF_WORKING_DAY;
	private final int MAX_HRS_IN_MONTH;
	private int totalEmpWage;

	public EmpWageMultiCompaniesObject(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAY, int MAX_HRS_IN_MONTH) {
		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAY = NUM_OF_WORKING_DAY;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	public void computeEmpWage()
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAY)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			{
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		
	}

	@Override
	public String toString() {
		return "Total Employee wage for company " + company + " is :  " + totalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageMultiCompaniesObject DMart = new EmpWageMultiCompaniesObject("DMart", 20, 2 ,10);
		EmpWageMultiCompaniesObject VMart = new EmpWageMultiCompaniesObject("VMart", 30, 5 ,20);
		DMart.computeEmpWage();
		System.out.println(DMart);
		VMart.computeEmpWage();
		System.out.println(VMart);
	}

}
