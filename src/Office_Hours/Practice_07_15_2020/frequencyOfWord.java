package Office_Hours.Practice_07_15_2020;

public class frequencyOfWord {
    public static void main(String[] args) {

        // write a program that can find the frequency
        // of a word (not in a sentence)
        //input = catcatcat  output= 3

        String str = "catcatcat cat catcatcat cat";
        str = str.toLowerCase();

        int count = 0;
        while (str.contains("cat")){
            count++;
            str = str.replaceFirst("cat", "");
        }

        System.out.println(count);
        System.out.println(str);

    }
}
