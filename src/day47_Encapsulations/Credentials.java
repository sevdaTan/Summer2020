package day47_Encapsulations;
/*
1. create class Credentials
            instance variables:
                    public name
                    public age
                    private username
                    private password
                    getter & setter
                    add a constructor to set name & age
 */
public class Credentials {
    public String name;
    public int age;

    // setters preferred for the private data
    private String username;
    private String password;

    public static String companyName;

    static {
        companyName = "FaceBook";
    }

    public Credentials(String name, int age){
       this.name = name;
       this.age = age;


    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }


    public String toString(){
        return "Name: "+ name+ "\nAge: "+age;
    }

}
