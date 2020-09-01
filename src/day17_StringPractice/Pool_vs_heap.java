package day17_StringPractice;

public class Pool_vs_heap {
    public static void main(String[] args) {

        String s1 = "Cybertek";
        String s2 = "Cybertek";

        System.out.println(s1 == s2);//true

        String s3 = new String("Cybertek");
        System.out.println(s1 == s3);// false
        String s4 = new String("Cybertek");
        System.out.println(s3 == s4);//false

        String s5 = "cybertek";
        System.out.println(s2 == s5);//false

    }
}
