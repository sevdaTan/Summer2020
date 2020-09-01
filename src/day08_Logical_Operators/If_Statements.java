package day08_Logical_Operators;

public class If_Statements {

    public static void main(String[] args) {

        int a = 110;
        int b = 20;

      if (a > b) { System.out.println( a + " is maximum number" );

      }

      if (b > a) {
            System.out.println(b + " is maximum number");
        }

      if (a == b){ System.out.println("Both numbers are equal") ;
      }

      System.out.println("********************");

      boolean breakTime = true;

      if(breakTime == true){
          System.out.println("Take 15 minutes break!");
      }

      if (breakTime == false) {
          System.out.println("Keep studying!");
      }

        System.out.println("********************");

      boolean Corona = true;
      if (Corona == true ) {
          System.out.println("Stay at home \n Social Distance \n use hand sanitizer");
      }

        System.out.println("********************");

       boolean f = true;
       boolean y = !f == false;
       boolean z = y;

       if (f){
           System.out.println("hi");
       }
        if (y){
            System.out.println("hu");
        }if (z){
            System.out.println("he");
        }
        System.out.println("*********");
      int x = 10;
        int y1 = x++;
        System.out.println(y1++ +""+ x++ +"" + y1);

        System.out.println("*******");

        int num = 9;
        if (num++ == 10){
            System.out.println("hi" + num);
        }else {
            System.out.println("re"+num);
        }
        System.out.println("***********");
        int sc = 0;
        if(sc == 0){
            sc += 50;
        }if (sc != 0){
           sc += 50;
        } System.out.println(sc);

        System.out.println("********");



    }
}
