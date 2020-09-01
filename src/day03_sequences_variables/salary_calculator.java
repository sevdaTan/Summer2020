package day03_sequences_variables;

public class salary_calculator {

    public static void main(String[] args) {

         int salary = 120000;
         double tax = 0.28;

        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(totalTax);
        System.out.println(salaryAfterTax);

    }


}
