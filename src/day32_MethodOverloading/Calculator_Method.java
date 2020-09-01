package day32_MethodOverloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Calculator_Method {


// 2. write a return method that accepts two numbers and an
//             operator, then returns calculation result.
//             if the operator is invalid, return zero
//             otherwise return the result

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNum =  scan.nextDouble();
        System.out.println("operator:");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number:");
        double secondNum =  scan.nextDouble();

       double result = calculator(firstNum,operator,secondNum);
        System.out.println("The result is: "+result);

    }






   // + - * / %
    public static double calculator (double num1, char operator,double num2){
        double result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 :
                (operator == '*') ? num1 * num2 : (operator == '/') ? num1 / num2 :
                        (operator == '%') ? num1 % num2 : 0;

        return result;

    }




}
