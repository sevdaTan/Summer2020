package day16_String;

public class equals_practice {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String ("Java");

        System.out.println(str1 + " : "+str2);
        System.out.println(str1 == str2);//false

        System.out.println(str1.equals(str2));//True

        String str3 = new String ("Java");
        String str4 = new String ("Java");
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4));//True

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6); // true
        System.out.println(str5.equals(str6));//True





    }
}
