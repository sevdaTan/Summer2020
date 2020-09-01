package day43_Static;

public class StudentObjects {
    public static void main(String[] args) {

        Cybertek_Student obj1 = new Cybertek_Student();
        obj1.studentName = "Sevda";

        Cybertek_Student obj2 = new Cybertek_Student();
        obj2.studentName = "Kevser";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);

        System.out.println(obj1.schoolName);
        System.out.println(obj2.schoolName);

        System.out.println(Cybertek_Student.schoolName);

    }
}
