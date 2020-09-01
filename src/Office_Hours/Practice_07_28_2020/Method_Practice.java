package Office_Hours.Practice_07_28_2020;

public class Method_Practice {
   /* Access_modifier   Specifier  return_Type  Name(Parameter)
   {Statement)

*/

    public static void main(String[] args) {
        String name ="sevda";
        String reversedName = reverseStr(name);

        System.out.println(reverseStr(name));
        System.out.println(reversedName);

        isPalindrome("Level");
        isPalindrome(name);

        System.out.println("================");

        String[] names = {"","","","",""};

for(String  each : names){
   // System.out.println(reverseStr(each));
    //isPalindrome(each);
}


    }



    public static String reverseStr(String str){ // ABC
        String result = ""; // CBA

        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }

    public static void isPalindrome(String str){ // ABC
        String reversedStr = reverseStr(str); // CBA
        boolean palindrome = str.equalsIgnoreCase(reversedStr);
        System.out.println(palindrome ? str + "is Palindrome" : str + "is NOT Palindrome");

    }










}
