package day20_WhileLoops;

public class whileLoop_Practice {
    public static void main(String[] args) {

for (int i = 1;i <= 10; i++){
    System.out.print(i + " ");
}
        System.out.println();

int num =1;
while (num <= 10){
    System.out.print(num + " ");
    num++;
}
     System.out.println();
     System.out.println("=========");
//print your name 5 times
        int n = 10;
                while(n < 15 ){
                    System.out.print(" Sevda ");
                    n++;
                }
        System.out.println();
        System.out.println("=======");
    //reverse
        String result = "";
        String str = "Sevda";
        int index = str.length()-1;
        while (index >= 0){
            result += str.charAt(index);

            index--;
        }
        System.out.print(result + " ");



    }
}
