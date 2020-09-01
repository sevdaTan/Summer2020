package day07Unary_shorthand;

public class LeapYear {
    /*1. create a class called LeapYear, and write a program
    that can identify if the given is Leap Year, print true if
    it's leap year, otherwise print false
		Ex:
			year = 2020  ==> short;

			LeapYear =true/false;

		output:
			2020 is leap year: true

			Assume that any year that can be divisble by 4 is
			leap year

*/

    public static void main(String[] args) {
        short year = 2020;
        boolean leap_year = year % 4 == 0;

        System.out.println( "Year " +year + " is a leap year: " + leap_year);



    }
}
