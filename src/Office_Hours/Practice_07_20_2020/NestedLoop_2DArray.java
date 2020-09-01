package Office_Hours.Practice_07_20_2020;

public class NestedLoop_2DArray {
/*
Task:
    write a program that can find the maximum number from any given two dimensional array
        solution one: use nested for loops

        solution three: use for loop and for each loop together

 */

    public static void main(String[] args) {
                        // 0 1 2    0 1 2 3    0 1 2  3  4    0   1  2  3  4  5
        int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12},{21,32,55,43,99,78}};
                        //   0          1           2              3

        int max = arr2D[0][0];
for (int j = 0; j <= arr2D.length-1; j++) { // index numbers of arrays
    int[] eachArr = arr2D[j];
    for (int i = 0; i < eachArr.length; i++) { //index numbers of elements
        int eachNum = eachArr[i];
        if (eachNum > max) {
            max = eachNum;
        }
    }
}
        System.out.println(max);






    }

}
