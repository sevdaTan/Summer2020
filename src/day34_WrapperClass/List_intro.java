package day34_WrapperClass;
import java.util.ArrayList;
public class List_intro {

    public static void main(String[] args) {


      ArrayList <Integer> scores = new ArrayList<Integer>();
          scores.add(90); //Autoboxing / index 0
          scores.add(100); // index 2
          scores.add(87); // index 3
          scores.add(70); // index 4
          scores.add(56); // index 5
        scores.add(1,65); // index 1
        //scores.add(7,43); // index 7 // you cannot skip the element : IndexOutOfBoundsException
        scores.add(6,66); // index 6


        System.out.println(scores);

        //100:
        System.out.println(scores.get(2));

        System.out.println(scores.size());







    }
}
