package Office_Hours.practice_06_30_2020;

public class elseIf_practice {
    public static void main(String[] args) {

      int score = 80;
      char grade = ' ';

      if (score >= 90 && score < 100){
          grade = 'A';
      }else if (score >= 80 && score < 90){
          grade = 'B';
      }else if (score >= 70 && score < 80){
          grade = 'C';
      }else if (score >= 60 && score < 70){
          grade = 'D';
      }else {
          grade = 'E';
      }
        System.out.println(grade);



    }
}
