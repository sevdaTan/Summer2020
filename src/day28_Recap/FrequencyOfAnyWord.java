package day28_Recap;

import java.util.Scanner;

public class FrequencyOfAnyWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find how many times cat occurred?");
        String str =scan.next().toLowerCase(); // "catdogcatcCATDOGDogdogCat"
        // (0,3)

       int count = 0;  // cat
        for (int i = 0; i <= str.length()-3; i++){//asagiyi +3 yapacagimiz icin buradan -3 cikariyoruz.
            // yoksa indexOutOfBoundException hatasi verebilir
           if (str.substring(i, i+3) .equals("cat")){ // cat kelimesi 3 harfli oldugu icin +3 yazdik
               count++;
           }
        }
        System.out.println(count);



    }
}
