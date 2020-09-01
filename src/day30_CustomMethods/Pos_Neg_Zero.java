package day30_CustomMethods;

public class Pos_Neg_Zero {
  /*
    step1: create a function that can check if
    the given integer is positive, negative or zero

		step2: Use the above method to
		 write a program that can check every single
		  elements of an array of Integers

		MUST use for each loop
   */
  public static void main(String[] args) {

    PosNegZero(500);

      int[] arr = {122,54,0,-65,90,-69};
      for(int each : arr){
       PosNegZero(each);
}
  }
    public static void PosNegZero(int num){
       if (num > 0){
        System.out.println(num +" is positive");
       }else if(num < 0){
        System.out.println(num + " is negative");
       }else{
        System.out.println(num + " is zero");
    }
}


}
