package day27_Recap;

public class ForEachLoop {
    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5};
    for (int i = 0; i <=arr.length-1; i++ ){
        System.out.print(arr[i]+ " ");
    }
        System.out.println();
        System.out.println("+++++++++++");
        System.out.println();

        for(int each : arr){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("==============");
        for (int i = arr.length-1; i >= 0; i-- ){ // decrement
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("===========");
        int[] scores = {10,20,30,40,50,60,70,80,90 };
        int divisibleBy3 = 0;
        for (int each : scores){
            if(each %3 != 0){
                continue;
            }
            divisibleBy3++;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(divisibleBy3);

        System.out.println("==========");
        String[] names = {"AB","ACB", "AD","HYT"};// icinde C geceni buluyoruz

        for(String each : names){
            if (!each.contains("C")){
                continue;
            }
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("@@@@@@@@@@@@@");
        // find the max and min numbers
        int[] score = {100,20,63,44,35,60,70,97,90 };

        int max = score[0];
        int min = score [0];

        for (int each : score){
            if (each > max){
                max = each;
            }
            if (each < min){
                min= each;
            }

        }
        System.out.println("Max num: "+ max);
        System.out.println("Min num: "+ min);




    }
}
