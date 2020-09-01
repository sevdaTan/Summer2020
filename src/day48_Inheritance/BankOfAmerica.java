package day48_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Sevda","Tan");
        obj.setAccountHolder(obj.firstName+ " " +obj.lastName);
        obj.setAccountNumber(90889876);
        obj.setBalance(50);

        obj.availableBalance();
        obj.deposit(500);
        obj.availableBalance();

        obj.withdraw(700);
        obj.withdraw(-300);
        obj.withdraw(0);
        obj.withdraw(220);
        obj.deposit(100000);
        System.out.println(obj);


    }
}
