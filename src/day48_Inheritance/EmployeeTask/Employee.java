package day48_Inheritance.EmployeeTask;
/*
1. super class: Employee
                    variables: salary, name, id, jobTitle, gender
                    methods: setInfo, toString
 */
public class Employee {

    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public void setInfo(double salary, String name, long id, String jobTitle,char gender){
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;

    }
    public String toString(){
        return  "Name: "+name+"\nID: "+id+ "\nJob Title: "+jobTitle+ "\nSalary:  $" +
                        ""+salary+ "\nGender: "+gender;
    }

}
