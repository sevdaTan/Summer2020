package day08_Logical_Operators;

public class Practice3_or {

    public static void main(String[] args) {

        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
                    // 3 == 2 ||  2 == 2  &&  1== 2
                    // false  ||  true => true && false => False
        System.out.println(res);
        System.out.println(b);


        System.out.println("*********");

        int b1 = 2;
        boolean res1 = b1++ == 2 || b1-- == 2;
        System.out.println(res1);
        System.out.println(b1);

        System.out.println("*********");

        boolean a = true;// c = false
        boolean c = !a;
        boolean d= a != c && a == !c && !a == c;
             // true != false && true == true && false == false
            //    true        &&     true   &&    true => true
        System.out.println(d);

        System.out.println("*********");



    }



}
