package day16_String;

public class StartWith_EndWith {
    public static void main(String[] args) {

        String str = "Sevda";
        System.out.println(str.startsWith("S"));//True
        System.out.println(str.startsWith("e")); // False
        System.out.println(str.startsWith("Sev"));//true

        System.out.println(str.endsWith("a"));//true
        System.out.println(str.endsWith("d"));//false
        System.out.println(str.endsWith("da"));//true



    }
}
