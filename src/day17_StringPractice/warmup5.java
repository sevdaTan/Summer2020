package day17_StringPractice;

public class warmup5 {
    /*
    5. write a program that can reverse the following string:

                String str = "Java";
                output: avaJ

            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
 */
    public static void main(String[] args) {

    String str = "Java";
    String ch1 = str.substring(0,1);
    String ch2 = str.substring(1,2);
    String ch3 = str.substring(2,3);
    String ch4 = str.substring(3,4);
    System.out.println(""+ch4+ch3+ch2+ch1);

    /*String s1 = str.substring(1);//ava
    String s2 = str.substring(0,1);//J
        String r = s1 + s2;
        System.out.println(r); */



    }
}
