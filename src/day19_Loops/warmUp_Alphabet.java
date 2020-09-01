package day19_Loops;

public class warmUp_Alphabet {
    public static void main(String[] args) {
// writing all letters in English alphabet in ascending order
char ch;
for (ch = 'A'; ch <= 'Z'; ch++){
    System.out.print(ch +" ");
}
 // writing all letters in English alphabet in descending order
        System.out.println();
       char ch1;
       for (ch1 = 'Z'; ch1 >= 'A'; ch1--){
           System.out.print(ch1 +" ");
        }
        System.out.println();
        System.out.println("Hello");
/*

       for (int i = '65'; i <= '90'; i++){
           System.out.print((char) i +" ");
        }
 */
    }
}
