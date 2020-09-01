package Office_Hours.Practice_07_20_2020;

import java.util.Arrays;

public class Max_2DArr_2 {

   // solution two: use nested for each loops
    public static void main(String[] args) {
                            // 0 1 2    0 1 2 3    0 1 2  3  4    0   1  2  3  4  5
            int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12},{21,32,55,43,99,78}};
            //   0          1           2              3

            int max = arr2D[0][0];
        for (int[] each1D : arr2D){ // to get each 1D Array
            //System.out.println(Arrays.toString(each1D));// tum arrayleri print etmek icin

       for (int eachNum : each1D){ // to get each element
           if (eachNum > max){
               max = eachNum;
           }

       }
           // System.out.println(max);// buraya print etmesini yazarsak her bir arraydeki max num a ulasiriz

        }
        System.out.println(max); //hepsine bakip max numi print eder



    }
}
