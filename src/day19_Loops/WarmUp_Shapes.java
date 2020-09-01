package day19_Loops;

public class WarmUp_Shapes {
    public static void main(String[] args) {
        /*
        2.  print the following shape:
            	* * * * * *
				* * * * * *
				* * * * * *
				* * * * * *
				* * * * * *
				* * * * * *
				* * * * * *
				* * * * * *
  */
        for (int i = 0; i < 8;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("*");
            System.out.println();

        }
/*
 for (int i = 0; i < 8;i++) {
  System.out.print("* * * * * *");
   }
 */


/*
3. print the following shape:

					* * * * * *
					*         *
					*         *
					*         *
					*         *
					*         *
					*         *
					*         *
					*         *
					* * * * * *
	Hint: in the loop body , only place the statements
	that you need to repeat

 */
        System.out.println();


        System.out.println("* * * * * *");
        for (int k = 0; k < 8; k++){
        System.out.println("*         *");
}
        System.out.println("* * * * * *");

/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *

 */
        for (int g = 1; g <= 8; g++ ) {
            for (int h = 1; h < g; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
