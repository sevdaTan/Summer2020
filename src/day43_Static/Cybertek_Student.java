package day43_Static;

class A{
    static int a = 200;
}

public class Cybertek_Student {
    // for the advantage of static

//    public static void main(String[] args) {
//        System.out.println(A.a); // calling from the class name
//    }


    String studentName;
    int age;
    char gender;

    static String schoolName = "Cybertek School";
    // all the objects from this class will have the same variable

    public void getInfo(){
        System.out.println("Name: "+ studentName);
    }

    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }

}
