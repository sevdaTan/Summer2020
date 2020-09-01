package day07Unary_shorthand;

public class Post_vs_Pre {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);//11
        System.out.println(a);//11

        System.out.println("=========");

        int b = 10;
        System.out.println(b++);//10
        System.out.println(b);//11

        System.out.println("==========");

        int c = 25;
        int d = c++; //25
        System.out.println(c);//26
        System.out.println(d);//25

        System.out.println("========");

        int e =25;
        e++;//26
        System.out.println(e);

        System.out.println("========");
//task
        int  x = 2;
        int y = x++;
        System.out.println(y);


        int x1 = 2;
        System.out.println(x1++);

        int x2 = 2;
        System.out.println(--x2);

        int x3 = 8;
        int y3 = x3--; //y3 = 8
        System.out.println(y3); // y3 = 8
        System.out.println(x3); // x3 = 7

        System.out.println("==========");

        int r = 1; // r = 0 // r = 1 // r = 0 // r = -1
        r = -r-- + r++ / -r-- * --r;
        // r = -1 + 0 /  -1  *  -1
        // r =  -1 + 0 * -1
        // r =-1 + 0 = -1
        System.out.println(r);

        System.out.println("============");

        int A = 50;
        A = --A + A++ + A-- + A++;
        // A = 49 + 49 + 50 + 49

        System.out.println(A);

        System.out.println("============");

        int s = 4;
        int t = s * 4 - s++; //12
        System.out.println(t);


    }


}
