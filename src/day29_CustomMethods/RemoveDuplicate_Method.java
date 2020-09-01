package day29_CustomMethods;

public class RemoveDuplicate_Method {
    //10. write a method that can remove
    // the duplicates from the string

    public static void main(String[] args) {
       String str = "aaaaabbbbbccccddddeeeeffssrrtgftt";

        RemoveDup(str);

        String str2 = "EnesBurakEmrahSevda";
        RemoveDup(str2);

    }

    public static void RemoveDup(String str){ // abaaab
    String nonDup = ""; //ab

    for ( String each : str.toLowerCase().split("")){
        if (!nonDup.contains(each)){
            nonDup += each;
        }
        }
        System.out.println(nonDup);

    }

}
