package day30_CustomMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name = "Level";
        //reverseStr1(name);
        //System.out.println(name.equals( reverseStr1(name);));

      String reversedName = reverseStr2(name);
        System.out.println(name.equals(name));
        // burada return method kullandigimiz icin
        // reversed name'i palindrome'a cevirebildik

    }

    public static void reverseStr1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.toLowerCase().charAt(i);
        }
        System.out.println(result);
    }

    public static String reverseStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.toLowerCase().charAt(i);


        }
        //System.out.println(return); // NO NO NO!!! return methodtan once sout YAZMIYORUZ
        return result;
    }
}