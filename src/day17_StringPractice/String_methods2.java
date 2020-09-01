package day17_StringPractice;

public class String_methods2 {
    public static void main(String[] args) {

        //equals
        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");

        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s3 == s2);//false
        System.out.println(s3.equals(s2));//true

        // equalsIgnoreCase
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5));//false
        System.out.println(s4 == s5);//false

        System.out.println(s4.equalsIgnoreCase(s5));//true

        System.out.println("=======");

        //isEmpty()
        String str = " ";
        System.out.println(str.isEmpty());//false

        str = str.trim(); //""
        System.out.println(str.isEmpty());// true

        String str2 = "";
        System.out.println(str2.isEmpty()); // true

        System.out.println("========");
        //contains
        String str3 = "Java, C#, Python,Ruby";
        System.out.println(str3.contains("Java")); // true
        System.out.println(str3.contains("java")); // false

        System.out.println(str3.toLowerCase().contains("java"));// true

        String str4 = "ABCD";
        System.out.println(str4.contains("D")); // true

        System.out.println("=======");
        // startsWith
        String str5 = "Cybertek School";
        System.out.println(str5.startsWith("C")); // true


    }
}
