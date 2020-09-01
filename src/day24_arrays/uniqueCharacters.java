package day24_arrays;

import java.util.Scanner;

public class uniqueCharacters {
        public static void main(String[] args) {

            //write the unique characters from a string
          /*  String str = "ssseevvddaatan";


            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {

                    System.out.print(str.charAt(i));
                }
            }
*/              Scanner scan = new Scanner(System.in);
                System.out.println("Enter a string: ");
                String  str= scan.nextLine();
                String unique = "";

                for (int i = 0; i <= str.length()-1; i++){
                  char ch = str.charAt(i);
                  int first = str.indexOf(ch);
                  int last = str.lastIndexOf(ch);

                  if (first == last){
                         unique += ch;
                  }
                }
                System.out.println(unique);

                System.out.println();
                System.out.println("============");
                System.out.println();


                String  str2 = "CybertekSchool";
                String unique2 = "";

                for(int j = 0; j <= str2.length()-1; j++) {// because we need the frequency of every single character
                        char ch1 = str2.charAt(j);
                        int count1 = 0; //frequency of ch
                        for (int i = 0; i <= str2.length() - 1; i++) { // used for finding the frequency of ch1 and assign it
                                char each = str2.charAt(i);
                                if (ch1 == each) {
                                        count1 += 1;


                                }
                        }
                        if (count1 == 1) { // if it only occurred once
                                unique2 += ch1;
                        }
                }
                System.out.println(unique2);




        }
}
