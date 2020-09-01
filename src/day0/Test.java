package day0;

public class Test {


    public static void main(String[] args) {
        int num = 9;
        if (num++ == 10) {

            System.out.println("hello" + num);


        }else{
            System.out.println("hi"+num);
        }

        int s = 0;
        if(s == 0){
            s += 50;
        }if (s != 0){
            s += 50;
        }
        System.out.println(s);

        float f1 = (1560.00 > 12_60.00) ? 10 : 20;
        System.out.println(f1);
    }
}