package day44_Constructor;

public class Employee {
    /*
     1. Create a class called Employee
     instance variables:
       name, id, ssn, jobTitle, salary, gender
      static variable:
         isEmployed, hasSalary
            actions:
     setEmployeeInfo(): can initialize all the instance variables
   toString(): can return the info of the employee as string
     */

    String name;
    long ID;
    String SSN;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {
        isEmployed = true;
        hasSalary = true;
    }

    public void setEmployeeInfo(String name, long ID,
            String SSN, String jobTitle, double salary,
            char gender){

        this.name = name;
        this.ID = ID;
        this.SSN = SSN;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;


    }


    public String toString(){
        return "Name: "+ name+ ", ID: "+ ID +" SSN: "+ SSN+ "," +
                " Job Title: "+ jobTitle +"" +
                ", Salary: "+ salary+ ", Gender: "+ gender;
}


}
