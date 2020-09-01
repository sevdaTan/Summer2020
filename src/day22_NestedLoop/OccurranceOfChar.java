package day22_NestedLoop;

import java.util.Scanner;

public class OccurranceOfChar {
    public static void main(String[] args) {
/*
2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
			Ex
			     Input: AABAAC
			            A
			     Output: 4
	    Input: ABCC
			           C
			    Output: 2
 */
//String str = "asdeeatraaedsa";
//char ch = 'a';
Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
String str = scan.nextLine();
char ch = scan.next().charAt(0);


/*int count = 0;

for(int i = 0; i <= str.length()-1; i++){
    char each = str.charAt(i);

 if (each == ch){ //if true, means ch is occurred in str
     count+= 1;
 }

}
        System.out.println(count);

*/    int index =0;
while ((index <= str.length()-1)){
    char each = str.charAt(index);

    if (each == ch) { //if true, means ch is occurred in str
    }
    index++;
    System.out.println(index);
}



    }
}
