package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {

        String str = "SEVDATANTAN";
        String expectedResult = ""; // CERT
    for(int j = 0; j <= str.length()-1; j++) {
    char ch = str.charAt(j);
    int count = 0; // frequency of ch

    for (int i = 0; i <= str.length() - 1; i++) { // helps us to calculate the frequency of ch and assigns the variable
        char each = str.charAt(i);
        if (each == ch) {
            count += 1;
        }

    }
    if (count == 1) {
        expectedResult += ch;
    }
     }
        System.out.println(expectedResult);
    }
}
