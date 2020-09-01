package day25_Recap;

public class shortestString2 {
    public static void main(String[] args) {

        String[] arr = {"Sevda","Queyen","Sam","Isa","Ryan","Joe","Nurmehmet","Ali"};
        int minLength = arr[0].length();

        for (String each : arr){ // finds the minimum length of the string in the array
           // l == each.length()
            if (each.length() < minLength){
                minLength = each.length();

            }
        }
        for (String each : arr){ // to see how many strings' length in the array matching with the minimum length
            if(each. length() == minLength){
                System.out.println(each);
            }
        }




    }
}
