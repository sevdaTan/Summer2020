package day50_Inderitance_Overriding.Browsers;
/*
 5. create a class called Test:
      create an object of each browsers and call the get & close actions
 */
public class Test {
    public static void main(String[] args) {

         ChromeBrowser chrome = new ChromeBrowser();
         chrome.get("www.google.com");
         chrome.close();

        System.out.println("============");

         FirefoxBrowser firefox = new FirefoxBrowser();
         firefox.get("www.amazon.com");
         firefox.close();

        System.out.println("===========");

        OperaBrowser opera = new OperaBrowser();
        opera.get("www.facebook.com");
        opera.close();


    }
}
