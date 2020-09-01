package day24_arrays;

public class uniqueNumbers2 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,5,4,7};
        for(int a : arr) {

            int count = 0;
            for (int b : arr) {// only calculates the frequency of number

                if (b == a) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a + " ");
            }
        }


    }
}
