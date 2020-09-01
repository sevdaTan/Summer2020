package day07Unary_shorthand;

public class Quiz {

    public static void main(String[] args) {

        int i = 100;
        double d = 200;
        float f = 300;

        i =(int) f;
        f = i;
        d = f;
        f = (float) d;
        d = i;
        i =(int) d;

        System.out.println("Result A" + 0 + 1);// Result A01
        System.out.println("result B"+ (1) + (2)) ;//Result B12

        System.out.println("5 + 2 =" + 3 +4);// 5 + 2 = 34
        System.out.println("5 + 2 =" + (3 +4)); //5 + 2 = 7


        long a = 30L;
        long b = (short) a;
        System.out.println("value of b = ");//30

        float fl = 100.978_6543f;
        short sh = (byte) fl;
        byte by = (byte) sh; // 100


        int at = 3, et = 2;
        long ed = (at + et)*2/3%2; // 1

        long w = 3_000L;
        double z = (float)w;
        int g = (short)z;
        System.out.println(g % 1000); // 0


        System.out.println(10 / 3);//3
        System.out.println(10 / 3.0);//3.3333
        System.out.println((int)(10.0 / 3)); //3



    }
}
