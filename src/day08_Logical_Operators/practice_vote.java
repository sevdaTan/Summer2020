package day08_Logical_Operators;

public class practice_vote {
    public static void main(String[] args) {

        // for voting ; age >= 18 && citizen

        String firstName = "Sevda";
        String lastName = "Tanyildizi";
        int age = 36;
        String citizenship = "Japan";

        boolean eligibletovote = age >= 18 && citizenship == "USA";

        System.out.println(firstName +" "+ lastName + " is eligible to vote : " + eligibletovote);


    }
}
