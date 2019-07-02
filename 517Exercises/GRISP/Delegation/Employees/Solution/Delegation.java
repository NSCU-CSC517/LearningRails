public class Delegation {
    public static void main(String[] args) {
        Employee employee = new Employee(30, 160);
        employee.generateIncomeReport();

        employee.setSalaryPerYear(68000);
        employee.generateIncomeReport();
    }
}
