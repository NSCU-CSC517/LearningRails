package delegation.employees.complete;

public class HourlyPayCalculator {
	public static float calculateMonthlyPay(float hourly_pay, float hours_worked, float tax_rate) {
		float monthly_pre_tax = hourly_pay * hours_worked;
		float monthly_tax = monthly_pre_tax * tax_rate;
		return monthly_pre_tax - monthly_tax;
	}
	
	public static float calculateYearlyPay(float hourly_pay) {
		float num_weeks = 50;
		float hours_per_week = 40;
		return hourly_pay * hours_per_week * num_weeks ;
	}
}
