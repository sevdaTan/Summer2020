package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        // primitives  to wrapper class ====> Autoboxing
        //wrapper class to primitives =====>unboxing
       // String to primitives====> parse method
      //String to wrapper class ====> valueOf  Method

        String str = "123";

       int a = Integer.parseInt(str); // Neither autoboxing nor unboxing
//we added +1 to understand if the result is string or integer
        System.out.println(str+1); //1231
        System.out.println(a+1);//124

      // parse always returns us as primitive value
       Double d1 = Double.parseDouble("7.5"); // autoboxing
        System.out.println(d1 -1);

      String s1 = "true";
      // NO CASE SENSITIVITY in PARSE method
     boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);
        System.out.println("======ValueOfMethods=========");
         // valueOf always returns us to wrapper class value
        String s2 = "1000000.5";
        Double d2 = Double.valueOf(s2); // unboxing
        System.out.println(d2 * 3);


        String s3 = "FaLSe";
        boolean r2 = Boolean.valueOf(s3); // unboxing






    }
}
