package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,3,1,7,6,5,6,4,9,9};

        for (int b : arr1) {
            int num = arr1[0];
            int count = 0; // for the frequency of num in the arr

            for (int each : arr1) { // for counting the frequency of num
                if (each == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(b);
            }
        }


    }
}
