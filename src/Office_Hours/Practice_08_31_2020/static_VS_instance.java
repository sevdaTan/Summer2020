package Office_Hours.Practice_08_31_2020;

public class static_VS_instance {

    // instance = stores unique feature for each object
          // each object has a copy. belongs too the object
        // can be called through the object

    // static = stores one common features for all objects
       // all objects have one copy only. belongs to the class
     // can be called through the class name
    // static only accepts static


    int instanceVariable;
    static int staticVariable;

    public static void main(String[] args) {

        System.out.println(staticVariable); // 0
      //  System.out.println(instanceVariable); // static only accepts static

        static_VS_instance obj = new static_VS_instance(); //  constructor
        System.out.println(obj.instanceVariable); // 0

        System.out.println("===========");


        static_VS_instance obj1 = new static_VS_instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 200;

        static_VS_instance obj2 = new static_VS_instance();
        System.out.println(obj1.instanceVariable);//100
        System.out.println(obj1.staticVariable);//200

        System.out.println(obj2.instanceVariable);//0
        System.out.println(obj2.staticVariable);//200

        System.out.println(static_VS_instance.staticVariable);// preferred way for calling static (class name)


        System.out.println("=============");





    }
    public void instanceMethod1(){
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
    }


}
