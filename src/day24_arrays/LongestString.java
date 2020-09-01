package day24_arrays;

public class LongestString {
    /*
    1. Write a program that can return the longest
    string of text from a String array
 */
    public static void main(String[] args) {

String arr[] = {"Cybertek", "School", "is","wonderful!"};
int longest = arr[0].length();
int l = 0;
for (int i = 0; i <= arr.length - 1; i++){
    if (arr[i].length() > longest ){
        l = i;
    }
}
        System.out.println("The longest string is: "+ arr[l]);



    }
}
/*
String[] arr = {"Hi", "Hello", "Today", "tomorrow"};
​
        int longest = arr[0].length();
        int longestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>longest){
                longestIndex = i;
            }
        }
        System.out.println("The longest element of the array is "+arr[longestIndex]);
 */