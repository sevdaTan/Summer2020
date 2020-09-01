package day39_CustomClass;

public class ClientBankAccount {
    public static void main(String[] args) {

        BankAccount clientBankAccount = new BankAccount();

        clientBankAccount.setBankInfo("Dan Brown",432123453,590000);

        clientBankAccount.showBalance();
        clientBankAccount.deposit(29980);
        clientBankAccount.withdraw(70000);


    }


}
