package day19_Loops;

public class continueStatement { // continue is only used in loops

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){//1 2 3 4 5
            if (i == 3){
                continue; // jumps to the next iteration
            }
            System.out.print(i+ " ");// 1 2 4 5
        }
        System.out.println();
for (char ch = 'A'; ch <= 'F'; ch++){

    if (ch == 'C' || ch == 'E'){ //skips the condition statement
        continue;
    }

    System.out.print(ch + " ");//statement continue'dan sonra gelir
}




    }
}
