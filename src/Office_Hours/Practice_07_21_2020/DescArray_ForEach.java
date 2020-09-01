package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class DescArray_ForEach {

    public static void main(String[] args) {

        int[] arr = {98,78,110,67,55,36,40,9,5};

        Arrays.sort(arr);//[5, 9, 36, 40, 55, 67, 78, 98, 110]

        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[arr.length];// ayni kapasitede olmasi icin birbirine initilize ediyoruz

        int k = arr.length-1; //last index
        for(int each : arr){
            descArr[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(descArr));

    }


}
