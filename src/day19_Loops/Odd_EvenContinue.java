package day19_Loops;

public class Odd_EvenContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++){

            if (i %2 == 0){//if number is even,then skip
                continue;

            }
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("**********************");


        for (int i = 1; i <= 50; i++) {

            if (i % 2 != 0) { //if number is odd, skip it
                continue;

            }
            System.out.print(i + " ");
        }

    }
}
