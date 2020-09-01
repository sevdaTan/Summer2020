package day0;

import java.util.ArrayList;
import java.util.Arrays;

public class array {

    public static int MaxValue(int[] n){
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if(each > max)
                max = each;

            return max;

    }


}
