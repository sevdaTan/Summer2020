package day16_String;

public class indexOf_practice {
    public static void main(String[] args) {

        String s = "I like to work in Cybertek, we are learning Java";
        int r1 = s.indexOf("r");

        System.out.println(r1);
        System.out.println(s.charAt(r1));

        int r2 = s.indexOf("re");// returns the first char --> in here "r" index
        System.out.println(r2);

        int r3 = s.indexOf("rn");
        System.out.println(r3);

        System.out.println("=========");
        //lastIndexOf

        String s1 = "Java is a programming language, and Java is fun";
        int t = s1.indexOf("J");
        int i = s1.lastIndexOf("J");
        int n = s1.indexOf(" J"+1);
        int h = s1.indexOf("Java is fun");
        System.out.println(t + " "+ " "+  i +" " +n +" "+ h);





    }
}
