package day29_CustomMethods;

public class EligibilityToVote_method {
    //4. check eligibility to vote
//age, citizen, name
    //5. check eligibility to buy alcohol

        public static void main(String[] args) {

        vote("John", 28,true, "Biden");
        vote("Mary", 17, false, "Warren" );

        System.out.println("=============");

        eligibleToBuyAlcohol(true,20);
        eligibleToBuyAlcohol(false, 34);
        eligibleToBuyAlcohol(true, 43);

        System.out.println("===========");

        calculator(100,'*', 4);
        calculator(800,'%', 3);
        calculator(435, '-',543);


    }


    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age > 21){
            System.out.println("You're eligible to buy alcohol");
        }else{
            System.out.println("You can buy only milk!");
        }
    }




    public static void vote(String name, int age, boolean citizen, String candidateName) {
    boolean eligibleToVote = age >= 18 && citizen == true;
    if (eligibleToVote) {
        System.out.println(name + " is eligible to vote for " + candidateName);
    } else {
        System.out.println(name + " is NOT eligible to vote!");


    }
    }

    // calculator
    public static void calculator(double num1, char operator, double num2){
        // +, -, *, /, % , invalid
        switch (operator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
            case '%':
                System.out.println("Remainder: " + (num1 % num2));
                break;
            default:
              System.out.println("Invalid operator");
        }
    }


}
