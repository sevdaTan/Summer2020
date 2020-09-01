package day25_Recap;
//Write a program that can return the shortest string of text from a String array
public class ShortestString {
    public static void main(String[] args) {

        String[] arr = {"Sevda","Queyen","Ryan","Joe","Nurmehmet","Ali"};
        int minLength = arr[0].length();

        for (int i = 0; i <= arr.length-1; i++){ // finds the minimum length of the string in the array
            int l = arr[i].length();
            if (l < minLength){
                minLength = l;

            }
        }
for (int i = 0; i <= arr.length-1; i++){ // to see how many strings' length in the array matching
    if(arr[i]. length() == minLength){
        System.out.println(arr[i]);
    }
}


    }
}
