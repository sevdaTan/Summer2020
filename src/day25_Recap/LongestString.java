package day25_Recap;
//1. Write a program that can return the longest string of text from a String array
public class LongestString {
    public static void main(String[] args) {


        String[] arr = {"Sevda","Queyen","Sam","Isa","Ryan","Joe","Nurmehmet","Ali"};
        int maxLength = arr[0].length();

        for (String each : arr){ // finds the maximum length of the string in the array
            // l == each.length()
            if (each.length() > maxLength){
                maxLength = each.length();


            }
        }
        System.out.println(maxLength);// shows the length of string

        for (String each : arr){ // to see how many strings' length in the array matching with the maximum length
            if(each. length() == maxLength){
                System.out.println(each);
            }
        }




    }
}
