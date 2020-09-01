package day15_String;

public class String_Methods {
    public static void main(String[] args) {
                     //0123456789....
        String name = "Cybertek School";

        //charAt(index)
       char ch1 =  name.charAt(0);
        System.out.println(ch1);//'C'
       char ch2 = name.charAt(5);
        System.out.println(ch2);//'t'

        System.out.println("==========");

        // length() ==> int
        int l = name.length();
        System.out.println(l);

        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        System.out.println("===========");

        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");// "Cybertek School"
        System.out.println(schoolName);

        System.out.println("=========");

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        System.out.println("============");

        String schoolName1 = "Cybertek";
        schoolName1 = schoolName1.toUpperCase();
        System.out.println(schoolName1);

        System.out.println("============");

     //trim:
     String p = "    Cybertek School    ";
     p = p.trim();
     System.out.println(p);

     System.out.println("==========");




    }
}
