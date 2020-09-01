package day04_variables;

public class variable_string {

    public static void main(String[] args) {

        String schoolName = "Cybertek School";
        System.out.println(schoolName);

        System.out.println("==============");

        String employeeName = "Sevda Tan";
        String employeeID = "WQ4324";
        String jobTitle = "SDET";
        double salary = 126_899.99;
        char gender = 'F';
        boolean isFullTime = true;

        System.out.println("Employee name : " + employeeName);
        System.out.println("Employee ID   : " + employeeID);
        System.out.println("Job Title     : " + jobTitle);
        System.out.println("Salary        : $" + salary);
        System.out.println("Gender        : " + gender);
        System.out.println("Full time     : " + isFullTime);

    }
}
