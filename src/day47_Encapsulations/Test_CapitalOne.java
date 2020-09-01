package day47_Encapsulations;

public class Test_CapitalOne {
    public static void main(String[] args) {

        CapitalOneEmployees employee1 = new CapitalOneEmployees("Muhtar",20,"Instructor");
        employee1.setID(54321);
        employee1.setSalary(220000);
        employee1.setAddress("5467 ollio street,McLean, VA 22098 ");
     //   System.out.println(employee1);

        System.out.println(employee1.EmployeeName);
        System.out.println(employee1.EmployeeAge);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);
        System.out.println(employee1.getID());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAddress());
    }
}
