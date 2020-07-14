public class EmployeeWageComputation
{
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAY = 2;

	public static void main(String[] args)
	{
		System.out.println("-----: Welcome to Employee Wage Computaion Program :-----");

		int empHrs = 0,empWage = 0,totalWage = 0;

		for ( int day = 0; day < NUM_OF_WORKING_DAY; day++)
		{
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
			empWage = EMP_RATE_PER_HOUR * empHrs;
			totalWage += empWage;
			System.out.println("Employee Wage is:" +empWage);
	   	}
		System.out.println("Employee Total Wage is:" +totalWage);
	}
}
