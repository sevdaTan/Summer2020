package day12_Switch_Scanner;

public class MonthsWithNumbers {

    public static void main(String[] args) {

      int num = 10;
      String month = " ";

      switch (num){
          case 1:
              month = "January";
              break;
          case 2:
              month = "February";
              break;
          case 3:
              month = "March";
              break;
          case 4:
              month = "April";
              break;
          case 5:
              month = "May";
              break;
          case 6:
              month = "June";
              break;
          case 7:
              month = "Julry";
              break;
          case 8:
              month = "August";
              break;
          case 9:
              month = "September";
              break;
          case 10:
              month = "October";
              break;
          case 11:
              month = "November";
              break;
          case 12:
              month = "December";
              break;




          default:
              month = "invalid number";
      }
        System.out.println(month);

    }
}
