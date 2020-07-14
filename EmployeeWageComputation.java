public class EmployeeWageComputation
{
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAY = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

	public static void main(String[] args)
	{
		System.out.println("-----: Welcome to Employee Wage Computaion Program :-----");

		int empHrs = 0,empWage = 0,totalWage = 0,totalEmpHrs = 0,totalWorkingDays = 0;

		while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAY)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			{
				case IS_FULL_TIME:
			      	empHrs = 8;
			      	break;
				case IS_PART_TIME:
			      	empHrs = 4;
			      	break;
				default:
			      empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" +totalWorkingDays+ "  Emp Hrs:" +empHrs);
	   	}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Total Wage is:" +totalEmpWage);
	}
}
