package day23_arrays;

public class max_Min_arrays {
    public static void main(String[] args) {
        /*
        int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array
         */
int[] num = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
int max = num[0];
int min = num[0];

for (int i = 1; i <= num.length-1; i++) {
    if (num[i] < min) { //compares the array's elements and assign the min number to variable min
        min = num[i];
    }if (num[i] > max){ //compares the array's elements and assign the max number to variable max
        max = num[i];
    }
}
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
