package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResources.*;
// imports all static from HumanResources class

public class BankOfAzerbaijan {
    /*
     3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random three employees from HumanResources to the List
                3. use for each loop to print out the employee info
     */
    public static void main(String[] args) {
        ArrayList<Employee> list =new ArrayList<>();

        list.add(HumanResources.employee2);
        list.add(HumanResources.employee5);
        list.add(HumanResources.employee1);

        //list.addAll(Arrays.asList(employee1,employee2,employee5));
        // if we import the static class, wecan call the variables without the class name


        for (Employee each : list){
            System.out.println(each);
        }

    }



}
