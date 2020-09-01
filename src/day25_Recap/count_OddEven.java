package day25_Recap;

public class count_OddEven {
    public static void main(String[] args) {

        /*
         4. Write a program that can count the even and
         odd number from an array of integers
         */
  int[] nums =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
  int countEven = 0;
  int countOdd = 0;

  String even = "";
  String odd = "";

  for (int each : nums){
     /*
       if (each %2 == 0){
          countEven += 1;
          continue;
      }
          countOdd += 1;
      }
       */
      if (each %2 == 0){
          countEven += 1;
          even += each + " ";
      }else {
          countOdd += 1;
          odd += each + " ";
      }
  }

        System.out.println(even + "\nEven numbers :" + countEven);
        System.out.println(odd + "\nOdd numbers :" + countOdd);


    }
}
