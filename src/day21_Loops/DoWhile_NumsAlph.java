package day21_Loops;

public class DoWhile_NumsAlph {
    public static void main(String[] args) {

        //1~20 and Z~A

int num = 1;
do{
    System.out.print(num + " ");
    num++;
}while(num <=20);

        System.out.println();

char ch = 'Z';
do{
    System.out.print(ch + " ");
  ch--;
}while(ch >= 'A');

    }
}
