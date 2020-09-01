package day22_NestedLoop;

public class NestedLoop_Triangle {
    public static void main(String[] args) {

      for (int j = 1; j <= 7; j++){

          for (int k = 1; k <= j;k++){
              System.out.print("*");
          }
          System.out.println();
      }
        System.out.println();
        System.out.println("============");
        System.out.println();

for (int s = 1; s <= 7; s++){
    for(int m = 7; m >= s; m--){
        System.out.print("*");
    }
    System.out.println();
}




    }
}
