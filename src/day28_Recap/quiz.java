package day28_Recap;

public class quiz {
    public static void main(String[] args) {

        int wd = 0;// 0-1+1+2+2-1  = 5-2 =3
        String[] days = {"sun", "mon","wed","sat"};
        for (int i = 0; i <days.length; i++){
            switch (days[i]) {
                case "sat":
                case "sun":
                   wd -= 1 ;
                   break;
                case "mon":
                    wd++;
                case "wed":
                    wd +=2;

            }
        }
        System.out.println(wd);

        System.out.println("===========");

        int arr[] = {1,2,3,4};
        int i = 0;
        do{
            System.out.println(arr[i]+ " ");
            i++;
        }while(i < arr.length -1);






    }
}
