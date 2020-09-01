package day24_arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,-9,-7,-5};

        for (int i  = 0; i<= arr.length-1;i++){ // i is index number
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("==================");
// for( datatype each :  collection of data){}
        for (int each : arr){ // each: represents the elements in collection
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("==================");
        System.out.println();


        String[] teamMates = {"Busra","Quyen","Merfu","Gulseda","Sardor","Samir","Fatih","Hung","Zulyar","Ryan","Vadym","Jika"};
         for(String each : teamMates){
         System.out.print(each + " ");
 }
    }
}
