package day33_LocalDateTime;

public class uniques {
    /*
	Task03:
		1. create a method that can print out the
		 unique numbers from an array of integer
		2. create a method that can print out the
		unique numbers from an array of double
		3. create a method that can print out the
		 unique words from an array of String
		4. create a method that can print out the
		unique characters from an array of chars
     MUST use for each loop
     */
    public static void main(String[] args) {

        int[] arr = {2,3,1,3,4,2};


        for (int element : arr) {
            int count = 0;
            for (int b : arr) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.println("==========");

        int[] n1 = {10,5,6,7,5,3,2,7,2};
        uniqueElements(n1);

        System.out.println("==========");

        double[] n2 = {10,5.8,6,7,5.9,3,2.7,7,2};
        uniqueElements(n2);

        System.out.println("==========");

        String[] n3 = {"A","B","A","D","C","B"};
        uniqueElements(n3);

        System.out.println("==========");

        char[] n4 = {'A','D','S','D','A','T'};
        uniqueElements(n4);


    }

    public static void uniqueElements(int[] arr){
        for (int element : arr) {
            int count = 0;
            for (int b : arr) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

    }

    public static void uniqueElements(char[] arr){
        for (char element : arr) {
            int count = 0;
            for (char b : arr) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

    }

    public static void uniqueElements(double[] arr){
        for (double element : arr) {
            int count = 0;
            for (double b : arr) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

    }

    public static void uniqueElements(String[] arr){
        for (String element : arr) {
            int count = 0;
            for (String b : arr) {
                if (element.equals (b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

    }




}
