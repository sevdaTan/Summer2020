package day47_Encapsulations;

    public class CapitalOneEmployees {
    String EmployeeName;
    int EmployeeAge;
    String jobTitle;

    private int ID;
    private double salary;
    private String address;

    static String companyName;

    static{
        companyName = "Capital One";
    }
    public CapitalOneEmployees(String Employeename,int EmployeeAge, String jobTitle){
        this.EmployeeName = Employeename;
        this.EmployeeAge = EmployeeAge;
        this.jobTitle = jobTitle;

    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public double getSalary(){
        return salary;
    }public void setSalary(double salary){
        this.salary = salary;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

//    public  String toString(){
//        return "Company Name: "+companyName+ "\nEmployee Name: "+EmployeeName + "" +
//                "\nEmployee Age: "+EmployeeAge +"\nJob Title: "+jobTitle +"" +
//                "\nEmployee ID: "+ getID +"\nSalary: $"+ getSalary +"\nAddress: "+ getAddress;
//    }

}
