package day10_IfStatements;

public class vehicle {

    /*
    SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,
    2004-2006 and 2015-2017. write a program that can check if the vehicle is eligible to recall.
		if eligible, print: true
		otherwise: false
     */
    public static void main(String[] args) {

        int model = 2012;
        String iseligible = " ";

        if (model >= 1995 && model <= 1998 || model >= 2001 &&
                model <= 2002 || model >= 2004 && model <= 2006 ||
                model >= 2015 && model <= 2017 ){
            iseligible = "True";
        }else{
            iseligible ="False";
        }
        System.out.println(iseligible);





    }


}
