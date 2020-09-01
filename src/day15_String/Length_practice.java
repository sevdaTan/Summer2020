package day15_String;

public class Length_practice {
    public static void main(String[] args) {

/*
write a program that ask user to enter a sentence,
then print out the first and last characters.
 */
        String Sentence = "Today, it is a bit chilly and raining a lot." +
                           "Hope it will be sunny tomorrow";

        int lastIndexNumber = Sentence.length() - 1;
       // System.out.println(lastIndexNumber);

        char firstChar = Sentence.charAt(0);
        System.out.println(firstChar);
        char lastChar =Sentence.charAt(lastIndexNumber);
        System.out.println(lastChar);

        System.out.println("The first and last characters in your sentence are: "+ firstChar+ " and "+lastChar);

    }
}
