package day41_toString;

class TesterObject{
    public static void main(String[] args) {

        Tester[] testers ={ new Tester(),new Tester(),new Tester(),new Tester(),new Tester()};
        testers[0].setTesterInfo("Aalia",150000,"Female",18);
        testers[1].setTesterInfo("Naz",150000,"Female",18);
        testers[2].setTesterInfo("Kalbinur",  155000 , "Female", 21);
        testers[3].setTesterInfo("Rakhat", 130000, "Female", 28);
        testers[4].setTesterInfo("Edward", 110000, "Male", 30);


        for(Tester each  : testers ){
            System.out.println(each);
        }


    }
}






public class Tester {
    String name;
    double salary;
    String gender;
    int age;

    public void setTesterInfo( String name, double salary, String gender, int age){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+ age+ ", Salary: "+ salary;
    }
}
