package day31_Recap;

public class Method_Practice {

    public static void main(String[] args) {

      max(12,7);  //void oldugu icin sadece 1 kez kullanabiliriz bu methodu

        System.out.println("=========");

        System.out.println(max2(4,16));
        System.out.println(max2(4,16) / 3 % 2 * 5);



    }

    public static void max(int a, int b){ // void oldugu icin it doesn't return a value
        int max = a > b ? a : b;
        System.out.println(max);

    }

    public static int max2(int a,int b){

        return a > b ? a : b;
    }


}
