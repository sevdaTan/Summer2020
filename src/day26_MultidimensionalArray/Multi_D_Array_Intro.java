package day26_MultidimensionalArray;

import java.util.Arrays;

public class Multi_D_Array_Intro {
    public static void main(String[] args) {
// char[][] bu iki kutucuktan birincisi kacinci arrayin index sirasinda oldugunu temsil ediyor, ikincisi element sira numarasini gosteriyor
        char[] ch1 = {'A' ,'B'};
        char[] ch2 = {'C' ,'D', 'E'};
        char[] ch3 = {'F' ,'G','H','I'};


        // char[][] ch2D ={ch1 , ch2, ch3}; // boyle de yazilabilir
        char[][] ch2D = {{'A' ,'B'},{'C' ,'D', 'E'},{'F' ,'G','H','I'}};
                        //    0             1               2

        System.out.println(Arrays.toString(ch2D[1])); // hangi grubu gormek istiyorsak
        // onun numarasini yazip Arrays.toString ile birlikte yaziyoruz
        System.out.println(Arrays.toString(ch2D[0]));
        System.out.println(Arrays.toString(ch2D[2]));

        //B
        System.out.println(ch2D[0][1]);// hangi karakteri istiyorsak ikinci kutuya onun index nosunu yaziyoruz
        //F
        System.out.println(ch2D[2][0]);
        // G E
        System.out.println(ch2D[2][1]+ " "+ ch2D[1][2]);
        // A H D
        System.out.println(ch2D[0][0]+ " "+ ch2D[2][2] + " "+ ch2D[1][1]);

        System.out.println("=================");

        // {1,2,3},{4},{5,6},{7,8,9,10}

        int[][] nums = {{1,2,3},{4},{5,6},{7,8,9,10}};
                        // 0      1    2        3
        System.out.println(Arrays.toString(nums[3]));

        System.out.println("=================");
        //farkli cozumlerle bu sekilde print edilecek
        // {1,2,3}
        // {4}
        // {5,6}
        // {7,8,9,10}
        System.out.println(Arrays.toString(nums[0] ) + "\n"+Arrays.toString(nums[1] ) +"\n" +
                ""+Arrays.toString(nums[2] ) +"\n"+Arrays.toString(nums[3] ) );

        System.out.println("===============");

        for (int[] each : nums){
            System.out.println(Arrays.toString(each));
        }
        System.out.println("===============");
        for(int i =0; i <= nums.length-1; i++){
        System.out.println(Arrays.toString(nums[i] ));
    }
        System.out.println("===============");
        // {1,2,3},{4},{5,6},{7,8,9,10} write the entire array

        System.out.println(Arrays.deepToString(nums));




    }
}
