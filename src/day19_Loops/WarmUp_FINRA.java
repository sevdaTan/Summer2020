package day19_Loops;

public class WarmUp_FINRA {
    public static void main(String[] args) {
/*
1. Write a method which prints out the
numbers from 1 to 100 but for numbers
 which are a multiple of both 3 and 5,
 print "FINRA" instead of the number,
  for numbers which are a multiple of 3, print
  "FIN" instead of the number and for numbers which
  are a multiple of 5,
 print "RA" instead of the number.
 */

String result = "";
  for (int i = 1; i <= 100; i++){
   if (i % 3 == 0 && i % 5 == 0){
      result = "FINRA ";
   }else if( i % 3 == 0){
       result = "FIN ";
   }else if( i % 5 == 0){
       result = "RA ";
   }else {
       result = i + " ";
   }
      System.out.print(result);
}








    }
}
