package day39_CustomClass;

public class Carpet {

    int width;
    int length;
    double unitPrice;
    boolean isPersian;

public void setCarpetInfo(int carpetWidth, int carpetLength,
                          double carpetUnitPrice, boolean carpetIsParsian){

    width = carpetWidth;
    length = carpetLength;
    unitPrice = carpetUnitPrice;
    isPersian = carpetIsParsian;
}
public void calcCarpet(){
    if (isPersian) {
       double total = (width * length) * unitPrice + 200;
        System.out.println("The total price for this order is: $"+ total);
    } else{
      double total = (width * length) * unitPrice;
        System.out.println("The total price for this order is: $"+ total);
    }
}
public void getCarpetInfo(){
    System.out.println("Carpet width: "+ width + ", Carpet length: "+ length+ "," +
            " Price for each sq feet: "+ unitPrice + ", Persian: "+ isPersian);
}

}
