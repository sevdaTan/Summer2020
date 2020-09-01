package day13_scanner;

public class Switch_Browser {
    public static void main(String[] args) {

        /*
 write a program that can display the selected browser
			1.1  declare a String variable called browserName
			1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
			1.3. if the browser name does not match with the valid browsers' names,
					out put should be: Invalid Browser Name

		Do Not use: scanner, if statement, and ternary
 */
        String browserName = "Chrome";

        switch(browserName){

            case "Firefox":
                System.out.println("Opening Firefox Browser");
              break;

            case "Chrome":
                System.out.println("Opening Chrome Browser");
               break;

            case "Opera":
                System.out.println("Opening Opera Browser");
                break;

            case "Edge":
                System.out.println("Opening Edge Browser");
                break;

            case "Safari":
                System.out.println("Opening Safari Browser");

            default:
                System.out.println("Invalid Browser name!");

        }




    }
}
