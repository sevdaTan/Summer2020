package day17_StringPractice;

public class String_Methods {
    public static void main(String[] args) {
        //charAt()          //  01234567
        String str = "Cybertek";
        char ch1 = str.charAt(7);
        System.out.println(ch1);

        System.out.println("========");
        //concat / +
        String str2 = "Cybertek";
        str2 = str2+ " "+ "School";
        System.out.println(str2);

        System.out.println("========");
        // length() --> int  // lastIndex = length - 1
        String str3 = "Cybertek";
        int l = str3.length();
        System.out.println("Length: "+l);

        System.out.println("========");

        //lastIndex
        char ch2 = str3.charAt(l-1);// str3.length() - 1
        System.out.println("Last index number is: "+ch2);

        System.out.println("==========");

        // upperCase & lowerCase

        String str4 = "cybertek";
        str4 = str4.toUpperCase();//"CYBERTEK"
        System.out.println(str4);

        String str5 = "JAVA";
        str5 =str5.toLowerCase(); // java
        System.out.println(str5);

        System.out.println("========");

       //trim

        String str6 = "   Cybertek   ";
        str6 = str6.trim();
        System.out.println(str6);//"Cybertek"

        System.out.println("========");

     //substring()

        String str7 = "I like Java language";
        String word = str7.substring(7,10 + 1);//java
        System.out.println(str7);
        System.out.println(word);

        String word2 = str7.substring(12);// language
        String word3 = str7.substring(12,str7.length());// language
        System.out.println(word2);
        System.out.println(word3);

        String word4 = str7.substring(2,6);
        System.out.println(word4);

        System.out.println("============");

        // indexOf & lastIndexOfn --> int

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you!";
        int i = str8.indexOf("W");
        System.out.println(i);
        System.out.println(str8.charAt(i)); // indexOf un saglamasi charAt ile yapilir

        //int i2 == str8.indexOf(", W" + 2);
        int i2 = str8.indexOf("We");
        System.out.println(i2);
        System.out.println(str8.charAt(i2));// saglamasi

        String str9 = "Java Java Java";
        int i3 = str9.lastIndexOf("J");
        int i4 = str9.indexOf("J");
        int i5 = str9.indexOf(" Java ")+ 1;
        int i6 = str9. lastIndexOf("Java ");

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println("=======");

        //replace & replaceFirst

        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#");
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");
        System.out.println(s3);

        System.out.println("==========");




    }
}
