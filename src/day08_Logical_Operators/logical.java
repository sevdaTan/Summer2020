package day08_Logical_Operators;

public class logical {

    public static void main(String[] args) {

        // ! : opposite boolean
        boolean r1 = 9 > 7; // true
        boolean r2 = !r1;// false

        System.out.println(r1 + " :  " + r2);

        System.out.println( !false); // true
        System.out.println( !true); // false

        boolean r3 = !false == true;
         //  true == true ==> true

        System.out.println(r3);

        boolean r4 = true == !true;// false
        System.out.println(r4);

        System.out.println("==========");

        boolean r5 = 9 > 5 && 9 > 10;
        //            true && false ==> false
        System.out.println(r5);

        boolean r6 = !true && false; // false

        boolean r7 = !false && 6<9; // true

        System.out.println("==========");

        boolean r8 = true == !false || false == true; //true
        System.out.println(r8);

        boolean r9 = !false == false || true == !false;// true
        System.out.println(r9);



    }

}
