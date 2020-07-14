class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("-----: Welcome to Employee Wage Computaion Program :-----");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME)
		{
			empHrs = 8;
			empWage = EMP_RATE_PER_HOUR * empHrs;
			System.out.println("Employee is Preasent");
			System.out.println("Employee Wage is:" +empWage);
		}
		else
		{
			System.out.println("Employee is Abscent");	
		}
	}

}
