public class Employee {
	private float payPerHour = 0;
	private float hoursWorked = 0;
	private float salaryPerYear = 0;

	public Employee(float payPerHour, float hoursWorked) {
		// this.__________(1)__________ = payPerHour;
		this.payPerHour = payPerHour;
		// this.__________(2)__________ = hoursWorked;
		this.hoursWorked = hoursWorked;
	}

	public Employee(float salaryPerYear) {
		// this.__________(3)__________ = salaryPerYear;
		this.salaryPerYear = salaryPerYear;
	}

	public void setPayPerHour(float payPerHour, float hoursWorked) {
		this.payPerHour = payPerHour;
		this.hoursWorked = hoursWorked;
		salaryPerYear = 0;
	}

	public void setSalaryPerYear(float salaryPerYear) {
		this.salaryPerYear = salaryPerYear;
		payPerHour = 0;
		hoursWorked = 0;
	}

	public void generateIncomeReport() {
		if(salaryPerYear == 0) {
			// System.out.println("Yearly Salary: $" + __________(4)__________.calculateYearlyPay(payPerHour));
			System.out.println("Yearly Salary: $" + HourlyPayCalculator.calculateYearlyPay(payPerHour));
			// System.out.println("Monthly income: $" + __________(5)__________.calculateMonthlyPay(payPerHour, hoursWorked));
			System.out.println("Monthly income: $" + HourlyPayCalculator.calculateMonthlyPay(payPerHour, hoursWorked));
			System.out.println("Hourly Rate: $" + payPerHour);
		} else if(payPerHour == 0 && hoursWorked == 0) {
			System.out.println("Yearly Salary: $" + salaryPerYear);
			// System.out.println("Monthly income: $" + __________(6)__________.calculateMonthlyPay(salaryPerYear));
			System.out.println("Monthly income: $" + SalaryPayCalculator.calculateMonthlyPay(salaryPerYear));
			// System.out.println("Hourly Rate: $" + __________(7)__________.calculateHourlyPay(salaryPerYear));
			System.out.println("Hourly Rate: $" + SalaryPayCalculator.calculateHourlyPay(salaryPerYear));
		} else {
			System.out.println("Yearly Salary: $0\nMonthly income: $0\nHourly Rate: $0");
		}
	}
}
