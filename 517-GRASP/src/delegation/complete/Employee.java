package delegation.complete;

public class Employee {
	EmployeeType type;
	float hourly_pay = 15;
	float yearly_salary = 30000;
	float tax_rate = (float) 0.25;
	
	public Employee ( EmployeeType type) {
		this.type = type;
	}
	
	public void setType( EmployeeType type) {
		this.type = type;
	}
	
	public void generateMonthlyPayCheck() {
		float monthly_pay;
		if ( type == EmployeeType.hourly)
			monthly_pay = HourlyPayCalculator.calculateMonthlyPay(hourly_pay, (float) 160.0, tax_rate);
		else 
			monthly_pay = SalaryPayCalculator.calculateMonthlyPay(yearly_salary, tax_rate);
		System.out.println("Pay them: " + monthly_pay);	
	}
}
