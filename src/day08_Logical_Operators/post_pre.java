package day08_Logical_Operators;

public class post_pre {
    /*manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;

     */
    public static void main(String[] args) {

        int a = 200; //201 , 200 , 199,
        // b = -200  - 200 * 200 % 2
        // b = -200 - 40000 % 2
        // b = -200 - 0 = -2
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);

        System.out.println("=============");

        int x = 300;
        int y = 400;

        // z = 300 + 400 - 300 * 400 + 300 / 400
        // z =300 + 400 - 120000 + 300 / 400
        // z = 300 + 400 - 120000 + 0
        // z = -119300
        int z = x + y - x * y +x / y;
        System.out.println(z);




    }
}
