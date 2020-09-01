package day41_toString;

public class Developer {

    String name;
    double salary;
    String gender;
    int age;

    public void setDeveloperInfo( String name, double salary, String gender, int age){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;


    }


    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixBugs(){
        System.out.println(name + " is fixing bugs");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+ age+ ", Salary: "+ salary;
    }

}
class DeveloperObject{
    public static void main(String[] args) {

        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setDeveloperInfo("Ahmet",135000,"Male",36);
        developers[1].setDeveloperInfo("Sevda",125000,"Female",36);
        developers[2].setDeveloperInfo("Busra",138000,"Female",27);
        developers[3].setDeveloperInfo("Kevser",135000,"Female",33);
        developers[4].setDeveloperInfo("Jika",145000,"Female",30);
        developers[5].setDeveloperInfo("Merfu",130000,"Female",34);

       for (Developer each : developers){
           each.coding();
       }

        System.out.println("============");
       for (int i = 0; i < developers.length; i++){
           developers[i].fixBugs();
       }
    }
}