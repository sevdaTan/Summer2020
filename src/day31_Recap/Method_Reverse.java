package day31_Recap;

public class Method_Reverse {

    public static void main(String[] args) {

        String name = "madam";
        reverse1(name);

        System.out.println("=======");

        String rev = reverse2(name);
        System.out.println(reverse2(name));
        System.out.println(name.equalsIgnoreCase(reverse2(name))); // palindrome olup olmadigina bakiyoruz

    }

    public static void reverse1(String str) { // only checks the functionality

        String expectedResult = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            expectedResult += str.charAt(i);
        }

        System.out.println(expectedResult);
        System.out.println("==========");
    }


        public static String reverse2 (String str){

            String expectedResult1 = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                expectedResult1 += str.charAt(i);
            }

            return expectedResult1;

        }

    }