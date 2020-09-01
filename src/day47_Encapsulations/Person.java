package day47_Encapsulations;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    public Person(String name, int age, char gender,LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }


    private String address;
    private long ssn;
    private int ID;

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public String toString(){
        return "Name: "+name+ "\nAge: "+ age + "\nGender: "+gender +"\nDOB: "+ DOB;
   }



}
