package day47_Encapsulations;

public class myCredentials {
    public static void main(String[] args) {

        Credentials obj = new Credentials("Sevda",36);
        //obj.userName = "cybertek";
        obj.setUsername("Cybertek");
        obj.setPassword("CyberTek12345");

        //System.out.println(obj.userName);
        // System.out.println(obj.passWord);

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);

    }
}
