package day15_String;

public class substring_practice {
    public static void main(String[] args) {
                         //012345678910
        String sentence = "Java is fun";

        //substring (beginning index, ending index
        String word = sentence.substring(0 , 3+1 );

        String word2 = sentence.substring(8,10+1);

        System.out.println(word +" "+ word2);

        System.out.println("==========");

        String sentence2 = "I like Movies and TV series";
        String word3 = sentence2.substring(7,12+1);
        System.out.println(word3);

        System.out.println("==========");

        String firstName = "MUHTAR";
        String firstChar = firstName.substring(0,1);
       // "Muhtar".substring(1);
        String restChar = firstName.substring(1,firstName.length());//firstName.length() = last index + 1
        firstName = firstChar.toUpperCase() + restChar.toLowerCase();

        System.out.println(firstChar);
        System.out.println(restChar);
        System.out.println(firstName);

        System.out.println("============");

        String LastName = "school";
        String firstCh = LastName.substring(0,1);//S
        String remaining = LastName.substring(1);//chool
        LastName = firstCh.toUpperCase() + remaining.toLowerCase();
        System.out.println(firstCh);
        System.out.println(remaining);
        System.out.println(LastName);

        System.out.println("=======");

        String s = "I like Game of Thrones";
        String series = s.substring(7);
        System.out.println(series);

        System.out.println("==========");

         String s2 = "I like Java programming language";
         String language = s2.substring(7);
        System.out.println(language);

        System.out.println("==========");

    }
}
