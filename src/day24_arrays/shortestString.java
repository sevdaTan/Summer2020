package day24_arrays;

public class shortestString {
    /*
    2. Write a program that can return the
     shortest string of text from a String array
 */
    public static void main(String[] args) {

String arr[] = {"Cybertek","School","is","wonderful"};

int shortest = arr[0].length();
int sh = 0;
for(int i = 0; i <= arr.length - 1; i++){
    if (arr[i].length() < shortest){
        sh = i;
    }
}
        System.out.println("The shortest string is: " + arr[sh]);


    }
}
