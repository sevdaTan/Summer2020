package day20_WhileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch = 'A';
        while (ch <= 'E'){
            if (ch == 'C'){
                //break; olsaydi iteration gerekmiyor kendinden once
                ch++;
                continue;// skips everything even the iterator.
                    // o yuzden yukariya da iteratir yazmak gerekiyor
            }
            System.out.print(ch + " ");
            ch++;
        }
boolean a = true;
while (a){
    System.out.println("Test Started");
    //break; ==> sadece looptan cikar, kendinden sonraki statementi basar
    System.exit(0); // tum programdan cikar, kendinden sonraki statementi basmaz
}
        System.out.println("Completed");


    }
}
