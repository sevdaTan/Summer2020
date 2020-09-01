package day48_Inheritance.EmployeeTask;
/*
 2.2 Developer:
            variables:  salary, name, id, jobTitle, gender
                 add a constructor that can set the fields
                methods: fixingBugs, setInfo, toString
 */
public class Developer extends Employee {

    public Developer(String name, double salary, long id, String jobTitle, char gender) {
        setInfo(260987, "Kevser", 98099087, "Developer", 'F');


    }
    public void fixingBugs(){
        System.out.println(name + " is fixing the bugs");
    }




}
