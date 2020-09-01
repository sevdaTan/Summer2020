package day39_CustomClass;

public class BankAccount {
    String AccountHolder;
    int AccountNumber;
    double Balance;

    public void setBankInfo(String bankAccountHolder, int bankAccountNumber, double bankBalance){
        AccountHolder = bankAccountHolder;
        AccountNumber = bankAccountNumber;
        Balance = bankBalance;
    }

    public void showBalance(){
        System.out.println("Your balance is: $"+ Balance);
    }
    public void deposit( double AccountDeposit){
        Balance += AccountDeposit;
        System.out.println("Your balance after deposit is: $"+ Balance);
    }
    public void withdraw(double AccountWithdraw){
        if (Balance <= 0){
            System.out.println("Not enough money to complete this transaction!\n " +
                    "Your balance is: $" + Balance);
        }else if (AccountWithdraw > Balance){
            System.out.println("You are withdrawing more than available balance. You will be charged $35 penalty");
            Balance = Balance - AccountWithdraw - 35;
            System.out.println("Your account balance after withdraw is: "+ Balance);
        }else{
            Balance -= AccountWithdraw;
            System.out.println("Your account balance after withdraw is: "+ Balance);

    }


    }

}
