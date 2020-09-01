package day33_LocalDateTime;
import java.text.DecimalFormat;
public class FormatDecimals {

    public static void main(String[] args) {

       DecimalFormat m = new DecimalFormat("0.00") ;

       double a = 22 / 7.0;
        System.out.println(a);
        System.out.println(m.format(a));

     //6.67588976
        System.out.println(m.format(6.678765544));


    }


}