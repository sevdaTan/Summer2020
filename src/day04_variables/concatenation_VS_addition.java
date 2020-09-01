package day04_variables;

public class concatenation_VS_addition {

    public static void main(String[] args) {

        // addition: number + number
        System.out.println(12 + 36); // 48
        System.out.println('A' + 2); // 65 + 2 = 67
        System.out.println('A' + 'B'); // 65 + 66 = 131

        //Concatenation : append
        System.out.println("12" + 13); // 1213
        System.out.println("A" + 7); // A7
        System.out.println("Gender: " + 'M'); //Gender: M
        System.out.println("Tax: " + 3.5 + '%'); // Tax: 3.5%
        System.out.println(3.5 + '%' + "Tax"); // 3.5 + 37 + Tax
                                               // ==> 40.5Tax

    }


}
