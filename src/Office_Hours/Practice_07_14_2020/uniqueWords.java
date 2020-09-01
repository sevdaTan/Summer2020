package Office_Hours.Practice_07_14_2020;

public class uniqueWords {
    public static void main(String[] args) {

        String[] words = {"JavaScript","C#","Java","Python","C#","Python","C#" };
                       //        0       1    2      3       4     5       6


       for (String b : words) {
           //String s = words[0];
           int count = 0;
           for (String a : words) {// en fazla ne kac kez yazildiginii gosteriyor bu loop
               if (a.equals(b)) {
                   count++;
               }
           }
           //System.out.println(count); //
        if (count == 1){ //hangisinin unique oldugunu gosterir
         System.out.println(b);
            }
           System.out.println("******");
           if (count == 2){ //hangisinin iki tane oldugunu gosterir
               System.out.println(b);
           }
       }

    }
}
