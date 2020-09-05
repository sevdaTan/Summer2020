package day50_Inderitance_Overriding.Browsers;
/*
Browsers task:
    1. create a class called WebDriver
        actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser
 */
public class WebBrowser {

    public void get(String URL){
        System.out.println("Opening the" + URL +" in the default browser");
    }
    public void close(){
        System.out.println("Closing the default browser");
}
}
