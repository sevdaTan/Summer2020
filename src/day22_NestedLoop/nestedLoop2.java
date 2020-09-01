package day22_NestedLoop;

public class nestedLoop2 {
    public static void main(String[] args) {

        // we only need nested loop if we have to repeat another loop

        for (int j = 1; j <= 5; j++){
            for (int i = 1; i <=5; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("===========");
          // outer loop repeats the inner loop
        for(int sh = 1; sh <= 10; sh++){ //vertical_ ekranda kac sira basacagimizi soyluyoruz
            for(int n = 1; n <= 5; n++){ // ekranda ne basacagimizi soyluyoruz
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============");

        int k = 1;
        while(k <= 8){
            for(int n1 = 1; n1 <= 16; n1++){ // ekranda ne basacagimizi soyluyoruz
                System.out.print("&");
            }
            System.out.println();
            k++;
        }
        System.out.println("================");



    }
}
