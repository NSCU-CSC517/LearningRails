// public class SalaryPayCalculator extends __________(15)__________ {
public class SalaryPayCalculator extends Calculator {
	// __________(16)__________ float __________(17)__________(float salaryPerYear) {
	static float calculateHourlyPay(float salaryPerYear) {
		return salaryPerYear / (weeks * hoursPerWeek);
	}
}
