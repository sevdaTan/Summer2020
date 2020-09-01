package day24_arrays;
import java.util.Arrays;
public class arrays_Utility {
    public static void main(String[] args) {

    int[] arr ={1,2,3};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));
        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        System.out.println();
        System.out.println("========");
        System.out.println();

        String[] names = {"Sevda","Kevser","Busra","Muhtar"};
        System.out.println(names);// in order to print array variable we MUST convert it to string
        System.out.println(Arrays.toString(names));

        System.out.println();
        System.out.println("========");
        System.out.println();
// sort method siraya koymak icin kullaniliyor.
        int[] nums = {4,6,3,9,2,5};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// 2,3,4,5,6,9 --> siraya konulmasi icin yaziyoruz
        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum number is: "+ nums[nums.length-1]);
        System.out.println("Minimum number is: "+ nums[0]);

        System.out.println();
        System.out.println("========");
        System.out.println();

        String students[] = {"Sevda","Kevser","Busra","Muhtar"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println();
        System.out.println("========");
        System.out.println();

        //Arrays.equals() --> returns boolean

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

       boolean r1 =  Arrays.equals(arr1,arr2);
        System.out.println(r1);

        System.out.println();
        System.out.println("========");
        System.out.println();

        int[] arr3 = {4,2,1,3};
        int[] arr4 = {2,3,4,1};

        boolean r2 =  Arrays.equals(arr3,arr4);
        System.out.println(r2);

        System.out.println("========");

        Arrays.sort(arr3);
        Arrays.sort(arr4);
        boolean r3=  Arrays.equals(arr3,arr4);
        System.out.println(r3);

        System.out.println("==========");
        int[] arr5 = {4,2,1};
        int[] arr6 = {2,3,4,1};

        boolean r4 =  Arrays.equals(arr5,arr6);
        System.out.println(r4);

    }
}
