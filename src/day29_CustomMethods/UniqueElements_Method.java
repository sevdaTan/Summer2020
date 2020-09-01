package day29_CustomMethods;

public class UniqueElements_Method {

    // 8. write a method that can print out
    // the unique elements from an array of string

    public static void main(String[] args) {
        String[] arr = {"A","B","C","B","D","C"};
        unique(arr);
        System.out.println();
        System.out.println("Hello");
        String[] arr2 = {"X","S","W","S","Q","Q"};
        unique(arr2);

    }
public static void unique(String[] arr){

    for (String a : arr) { //gets each of the element

        int count = 0;

        for (String each : arr) { // checks the frequency of the element
            if (a.equals(each)) {
                count++;
            }
        }
        if (count == 1) { // checks if the element is occurred only once or not
            System.out.print(a + " ");
        }
    }
    //System.out.println(); // print oldugu icin araya bosluk koyuyoruz. ister yukarida ister burada
}



}
