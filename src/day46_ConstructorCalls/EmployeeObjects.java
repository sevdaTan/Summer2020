package day46_ConstructorCalls;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Christina");
        System.out.println(employee1);
        System.out.println("==============");

        Employee employee2 = new Employee("Chris","SDET");
        System.out.println(employee2);

        System.out.println("=============");

        Employee employee3 = new Employee("Kevser", "QA",8976544);
        System.out.println(employee3);
        System.out.println("==============");

        Employee employee4 = new Employee("Sevda", "SDET",987667,120000);
        System.out.println(employee4);
        System.out.println("==============");




    }
}
