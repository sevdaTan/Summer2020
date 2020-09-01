package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class ArrayDesc {
    public static void main(String[] args) {

        int[] arr = {98,78,110,67,55,36,40,9,5};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int[] descArr = new int[arr.length];

        //      k        i
    /*  descArr[0] = arr[8];
        descArr[1] = arr[7];
        descArr[2] = arr[6];
        descArr[3] = arr[5];
        descArr[4] = arr[4];
        descArr[5] = arr[3];
        descArr[6] = arr[2];
        descArr[7] = arr[1];
        descArr[8] = arr[0]; */

        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){
            descArr[k] = arr[i];
             k++;
        }
        System.out.println(Arrays.toString(descArr));




    }
}
