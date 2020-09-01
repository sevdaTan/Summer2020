package day43_Static;

public class Static_VS_Instance {

    static int staticVariable; // 1 copy
    int instanceVariable; // 2 copies

    public static void main(String[] args) {

        Static_VS_Instance obj1 = new Static_VS_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        Static_VS_Instance obj2 = new Static_VS_Instance();
        obj2.instanceVariable = 200;

        System.out.println("===== instanceVariable ====== ");

        System.out.println(obj1.instanceVariable); // 100
        System.out.println(obj2.instanceVariable); // 200
// each of the objects have its own copy

        System.out.println("===== staticVariable ====== ");

        System.out.println( obj1.staticVariable); // 500
        System.out.println( obj2.staticVariable); // 500
// even if we don't initialize the second variable, they share the same copy
        // calling from the object name is not preferred


        System.out.println(Static_VS_Instance.staticVariable); // calling from the class name is preferred.



    }

}
