package day08_Logical_Operators;

public class practice2_voting {

    public static void main(String[] args) {

        String name = "Enes Tarik";
        String lastName = "Tan";
        int age = 19;
        String citizen1 = "USA";
        String citizen2 = "Turkey";

        boolean eligibleAge = age >= 18;
        boolean UScitizen = citizen1 == "USA" || citizen2 == "USA";

       boolean eligibleToVote = eligibleAge && UScitizen;

       System.out.println(name + " " + lastName +" is eligible to vote for Trump: " + eligibleToVote);

        System.out.println("========================");

        String F_name = "Serdar Burak";
        String L_name = "Tan";
        int Age = 15;
        String citizn1 = "Turkey";
        String citizn2 = "USA";

        boolean VoteAge = Age >= 18;
        boolean voteCitizn = citizn1 == "USA" || citizen2 == "USA";

        boolean voting_eligibility = VoteAge && voteCitizn;

        System.out.println(F_name + " "+ L_name + " is eligible for voting Trump: " + voting_eligibility);
;




    }
}
