package day50_Inderitance_Overriding.Browsers;
/*
3. create a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
 */
public class FirefoxBrowser extends WebBrowser {

    public void get(String URL){
        System.out.println("Opens the "+URL+ " in the FireFox browser");
    }
    public void close(){
        System.out.println("Closes the Firefox browser");
    }



}
