package day44_Constructor;

public class HumanResources {
    /*
     2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
         1. initialize those static variables
         2. set all the info of the Employees
     */


        static Employee employee1; //we can call it by class name
        static Employee employee2;
        static Employee employee3;
        static Employee employee4;
        static Employee employee5;

        static {
         employee1 = new Employee();
         employee2 = new Employee();
         employee3 = new Employee();
         employee4 = new Employee();
         employee5 = new Employee();

         employee1.setEmployeeInfo("Sevda",9876556,"12542545",
                 "SDET",120000,'F');
        employee2.setEmployeeInfo("Cemile",4321156,"65432543",
                "CEO",240000,'F');
        employee3.setEmployeeInfo("Buket",8766556,"65437545",
                "Secretary",110000,'F');
        employee4.setEmployeeInfo("Seda",9564356,"12542545",
                "Manager",180000,'F');
        employee5.setEmployeeInfo("Rabia",654336,"98765545",
                "Developer",1350000,'F');
   }

}
