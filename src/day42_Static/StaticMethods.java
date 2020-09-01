package day42_Static;

public class StaticMethods {

     int a = 200;
    static int b =400;


    public static void main(String[] args) {
        System.out.println(b);

//        System.out.println(a);
//        System.out.println(this.a);

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
          // The ONLY way to call instances in a static method

        staticMethod();
        StaticMethods.staticMethod();//calling from the class name

       // instanceMethod(); we cannot call it directly. we have to call it through the object
        obj.instanceMethod();
      //  StaticMethods.instanceMethod(); only static ones can be called with the class name
    }
    // Which one has direct access? => static
    public static void staticMethod(){

    }
    public void instanceMethod(){

    }

}
