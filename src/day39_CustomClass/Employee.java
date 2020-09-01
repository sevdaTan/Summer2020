package day39_CustomClass;

import java.awt.*;

public class Employee {
/*
Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, Salary
 */
    String name;
    char gender;
    String SSN;
    String JobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender,
                String employeeSSN, String employeeJobTitle,double employeeSalary){

        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        JobTitle = employeeJobTitle;
        salary = employeeSalary;

    }
    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+JobTitle+", Salary: "+salary);

        System.out.println("Last four digits of SSN: "+  SSN.substring(SSN.length()-4)    );
    }









}
