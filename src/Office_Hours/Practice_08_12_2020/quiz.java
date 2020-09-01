package Office_Hours.Practice_08_12_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));

        int a = 1;//primitive int old. icin index 1 remove olur
        // Integer a = 1;
        // non-primitive old. icin object remove olur. [2,3]
        list1.remove(a);
        System.out.println(list1); // [1,3]




    }
}
