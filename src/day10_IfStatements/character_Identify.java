package day10_IfStatements;

public class character_Identify {

    /*
    write a program that can identify if the given character character is Alphabetic
			ex:
				character = 'a'

			output:
				a is an Alphabetic


				character  = '!'

			output:
				! is not  anAlphabetic


		Hint:
				ascii table:
						65 ~ 90 ==> A~Z
						97 ~ 122 ==> a~z


     */
    public static void main(String[] args) {


       char  character = '0';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122 );
                                  //           uppercase letter     ||    lowercase letters



       String alphabet= " ";

        if(isAlphabetic == true){
            //System.out.println(character + " is an alphabetic character");

            alphabet = character + " is an alphabetic character";
        }else
        {
           // System.out.println(character +" is not an alphabetic character");
       alphabet = character +" is not an alphabetic character";

        }
        System.out.println(alphabet);

        System.out.println("*****************");

        boolean isDigit = (character > 47 && character <= 57);


        String digit =" ";

        if (isDigit){
            digit = character + " is a digit";

        }else{
            digit = character + " is not a digit";
        }

        System.out.println(digit);

        System.out.println("***************");

        boolean specialChar = !isAlphabetic && !isDigit;

        String specialcharacter = " ";

        if (specialChar == true){
            specialcharacter = character + "is a special character";
        }else{
            specialcharacter = character + "is not a special character";
        }
        System.out.println(specialcharacter);


    }


}
