package day16_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class replace_practice {
    public static void main(String[] args) {




       String email = "cybertek@gmail.com";
        email= email.replace("gmail", "yahoo");
        System.out.println(email);

        System.out.println("==========");

         String word = "java";
          word = word.replace("a","e");//jeve
          System.out.println(word);

        System.out.println("==========");
                                                //C#          //Python
        String sentence =" I like to learn Java, Java is cool, Java is fun";
       sentence =  sentence.replace("a, Java", "a, C#");
       sentence = sentence.replace(" Java " , " Python ");
// unique olmasi icin onundeki ve arkasindaki character ya da bosluklara dikkat etmek lazim

        System.out.println(sentence);

        System.out.println("=========");

        String s1 = " I like stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek", " MIT");
        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);

        System.out.println("===========");

        String s2 = "I like to leaRn Java, we aRe enjoying Java";
        s2 = s2.replace('R','r'); //tek bir harf yazacaksak ' ' kullanilir
        System.out.println(s2);



    }
}
