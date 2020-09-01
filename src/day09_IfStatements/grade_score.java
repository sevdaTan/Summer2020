package day09_IfStatements;

public class grade_score {
    /*
Write a program that can calculate the grade based on the score
		if score is between 90 to 100 ==> A
		if score is between 80 to 90 ==> B
		if score is between 70 to 80 ==> C
		if score is between 60 to 70 ==> D
		if score is below 60 ==> F

		Ex: score = 85;

			output:
				Your grade is B



     */
    public static void main(String[] args) {

        double score = 82;

        if (score >= 90 && score <=100){
            System.out.println("Your grade is A");
        }
        if (score >= 80 && score <= 90){
            System.out.println("Your grade is B");
        }
        if (score >= 70 && score <= 80){
            System.out.println("Your grade is C");
        }
        if (score >= 60 && score <= 70){
            System.out.println("Your grade is D");
        }
        if (score < 60 ){
            System.out.println("Your grade is F");
        }
        if (score > 100 || score < 0){
            System.out.println("Invalid score. ( Please write " +
                               "your score between 0 - 100.)");
        }


    }



}
