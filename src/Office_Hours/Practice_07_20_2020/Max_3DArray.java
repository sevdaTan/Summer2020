package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {
                       //      0      1       0        1
        int[][][] arr3D = { {{1,2},{34,42}},{{5,6,7},{86,9,10}} };
                    //         0                1


        int max = arr3D[0][0][0];

        for (int[][] each2D : arr3D){

            for (int[] each1D : each2D){

                for(int eachElement : each1D){

                    if (eachElement > max){
                        max = eachElement;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
