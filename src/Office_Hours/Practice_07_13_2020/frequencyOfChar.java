package Office_Hours.Practice_07_13_2020;

public class frequencyOfChar {
    public static void main(String[] args) {

        String str= "OOOLWOPPRRPPN"; //O4W1P4R2N1

        String nonDup = ""; // "OWPRN" --> hepsinden birer tane yazdiriyoruz once

        //Remove Duplicates
        for(int i = 0; i <= str.length()-1; i++){
         String s = "" + str.charAt(i);// "OOOLWOPPRRPPN"
           if (!nonDup.contains(s)){
               nonDup += s;
           }
        }

        String result = "";



    for (int j = 0; j <= nonDup.length() - 1; j++) {
        char ch1 = nonDup.charAt(j);
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) { // counting frequency of char
            char each = str.charAt(i);
            if (each == ch1) {
                count += 1;

            }

        }
        result += "" + ch1 + count;
    }

        System.out.println(result);



    }
}
