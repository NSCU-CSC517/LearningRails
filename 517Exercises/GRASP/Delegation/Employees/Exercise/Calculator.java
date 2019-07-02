public abstract class Calculator {
    static float taxRate = (float) 0.25;
    static float weeks = 50;
    static float hoursPerWeek = 40;
    static int months = 12;

    __________(8)__________ float __________(9)__________(float payPerHour, float hoursWorked) {
        float monthlyPreTax = payPerHour * hoursWorked;
        float monthlyTax = monthlyPreTax * taxRate;
        return (monthlyPreTax - monthlyTax);
    }

    __________(10)__________ float __________(11)__________(float salaryPerYear) {
        float monthlyPreTax = salaryPerYear / months;
        float monthlyTax = monthlyPreTax * taxRate;
        return monthlyPreTax - monthlyTax;
    }
}
