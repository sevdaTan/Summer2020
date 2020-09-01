package day30_CustomMethods;

public class ReturnValue {


    public static void main(String[] args) {
        addition1(4,8);

       int sum = addition2(6,9);
        System.out.println(sum);


       System.out.println(addition2(6,9) * 2); // return kullandigimizda
                                                 // tekrar declare edebilir,
                                                // uzerinde oynamalar yapabiliriz

    }

    public static void addition1(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
public static int addition2 (int a,int b){
       int sum = a + b;
        return sum; // the value will be reusable
}



}
