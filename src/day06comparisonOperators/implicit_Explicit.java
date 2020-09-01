package day06comparisonOperators;

public class implicit_Explicit {

    public static void main(String[] args) {

     short s1 = 100;
     long l1 = s1; // implicit casting: automatically done

        long l2 = (long)s1;// if we do implicit manually


     int I1 = 300;
     double D1 = I1;//300.0
        System.out.println(D1);

        System.out.println("*************");

        double d1 = 400.87656;
        int i1 = (int) d1;// explicit casting: manually done
        System.out.println(d1); // 400


        long L1 = 18400;
        short sh1 = (short) L1;
        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte) n1;
        System.out.println(b1);

        double m1 = 34.2;
        float f1 =(int) m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (int) r1;
        System.out.println(p1);



    }
}
