package day42_Static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

   static String schoolName = "Cybertek School";
   static String favoriteTeacher = "Muhtar";

   public void setInfo(String name, int age, int groupNumber, char gender){
       this.name = name;
       this.age = age;
       this.groupNumber = groupNumber;
       this.gender = gender;
   }
   public String toString(){ //instance method

       return "School Name: "+ schoolName+ "\nStudent Name: "+ name+ "\nFavorite teacher: "+ favoriteTeacher +"\nAge: " +age + "\nGroup number "+groupNumber +"\nGender "+gender;
                        // static variable           //instance method
   }


}
