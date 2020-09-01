package day29_CustomMethods;

public class Palindrome_Method {
//  9. write a method that can check if a string is
//  palindrome, print true if it's  otherwise print false
    public static void main(String[] args) {
     palindrome("civic");
     palindrome("Level");
     palindrome("click");

    }

public static void palindrome(String word){

        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }
    System.out.println(reversed.equalsIgnoreCase(word));

}


}
