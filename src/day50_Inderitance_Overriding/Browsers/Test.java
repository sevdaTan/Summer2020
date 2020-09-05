package day50_Inderitance_Overriding.Browsers;
/*
 5. create a class called Test:
      create an object of each browsers and call the get & close actions
 */
public class Test {
    public static void main(String[] args) {

         ChromeBrowser obj1 = new ChromeBrowser();
         obj1.get("www.google.com");
         obj1.close();

        System.out.println("============");

         FirefoxBrowser obj2 = new FirefoxBrowser();
         obj2.get("www.amazon.com");
         obj2.close();

        System.out.println("===========");

        OperaBrowser obj3 = new OperaBrowser();
        obj3.get("www.facebook.com");
        obj3.close();


    }
}
