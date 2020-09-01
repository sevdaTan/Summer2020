package day06comparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double rate = 62.5;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.2;
        int weeklyHour = 40;

        double salary = rate * weeklyHour * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Salary before tax: $" + salary);
        System.out.println("Total tax: $" + totalTax );
        System.out.println("Salary after Tax: $"+salaryAfterTax);

    }
}
