package day50_Inderitance_Overriding.Browsers;
/*
 2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser
 */
    public class ChromeBrowser extends  WebBrowser{
    public void get(String URL){
        System.out.println("Opens the "+ URL + " in chrome browser");
    }
    public void close(){
        System.out.println("Closes the Chrome browser");
    }


}
