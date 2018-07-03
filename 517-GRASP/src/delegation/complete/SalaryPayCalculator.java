package delegation.complete;

public class SalaryPayCalculator {
	
	public static float calculateMonthlyPay(float yearly_salary, float tax_rate) {
		float monthly_pre_tax = yearly_salary/12;
		float monthly_tax = monthly_pre_tax * tax_rate;
		return monthly_pre_tax - monthly_tax;
	}
	
	public static float getHourlyRate(float yearly_salary) {
		float num_weeks = 50;
		float hours_per_week = 40;
		return yearly_salary / (num_weeks * hours_per_week);
	}
}
