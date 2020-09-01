package day49_Inheritance.ScrumTeamTask;

import com.sun.xml.internal.bind.v2.model.core.ID;

/*
create a subclass of Employee called Testers
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
 */
public class Tester extends Employee{

    public Tester (String name,int age,char gender,double salary,int id,String jobTitle){
        setInfo(name, age, gender, salary, id, jobTitle);
    }
    public void smokeTesting(){
        System.out.println(name+ " is running smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }


}
