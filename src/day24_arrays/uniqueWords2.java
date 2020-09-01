package day24_arrays;

public class uniqueWords2 {
    public static void main(String[] args) {

      String[] words = {"Sevda","sen","Emrah","sen","Enes","sen","Burak"};

      for( String each : words) {
          int count = 0;
          for (String family : words) {
              if (each.equals(family)) {
                  count++;
              }
          }
          if(count == 1){
              System.out.println(each);
          }
      }

    }
}
