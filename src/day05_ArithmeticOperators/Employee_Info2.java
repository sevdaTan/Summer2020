package day05_ArithmeticOperators;

public class Employee_Info2 {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Daniel";
        String gender = "Male";
        byte age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        String fullName = firstName + " " + lastName;


        System.out.println("Employee' full name is: "+fullName+"\n" +
                fullName +"' gender is : " + gender+"\n" +
                fullName+"' age is: "+ age + " years old\n" +
               fullName+" works at: " + companyName+ "\n" +
                fullName+"' Job title is: "+jobTitle+ "\n" +
               fullName+"' salary is $" + salary + "\n" +
                fullName+" is full time employee: "+ isFullTime+ "\n" +
              fullName+" is married: "+ isMarried);



    }


}
