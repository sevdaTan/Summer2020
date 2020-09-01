package day07Unary_shorthand;

public class divisible_with_2_3_5 {
/*2. write a program that can check if a number is evenly divisible by 2, 3, 5
			Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
*/
    public static void main(String[] args) {

      int number = 65;
      boolean result1 = (number % 2 == 0);
      boolean result2 = (number % 3 == 0);
      boolean result3 = (number % 5 == 0);

        System.out.println(number + " is divisible by 2: " + result1 );
        System.out.println(number + " is divisible by 3: " + result2 );
        System.out.println(number + " is divisible by 5: " + result3 );





    }


}
