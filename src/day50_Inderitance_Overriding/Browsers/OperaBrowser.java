package day50_Inderitance_Overriding.Browsers;
/*
 4. create a class called Opera browser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
 */
public class OperaBrowser extends WebBrowser{

    public void get(String URL){
        System.out.println("Opens the "+URL+ " in the Opera browser");
    }
    public void close(){
        System.out.println("Closes the Opera Browser");
    }

}
