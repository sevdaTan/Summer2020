package day29_CustomMethods;

public class ReverseAnyString_Method {
   //7. create a method that can reverse any String

    public static void main(String[] args) {

        ReverseString("Sevda Tanyildizi");
        ReverseString("Burak , Enes, Sevda, Emrah");

    }

public static void ReverseString(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
    System.out.println(result);
}



}
