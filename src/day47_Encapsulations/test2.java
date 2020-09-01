package day47_Encapsulations;

public class test2 {

    static  int a = 200;

    static {
        a = 300;
    }
    public test2(){ // we don't have a obj constructor here, so it will not be executed / sonuc a = 300
        a = 400;

    }



    public static void main(String[] args) {
       new test2(); // burada obj olusturdugumuz icin print edecek. son hali a = 600
        // obj olusturmasaydik sonuc a = 300 olacakti
       a = 600;//this is static variable not instance variable

        System.out.println(a);
    }

}
