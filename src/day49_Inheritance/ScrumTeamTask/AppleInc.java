package day49_Inheritance.ScrumTeamTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
 create a class called AppleInc:
          1. create an array of Testers and store the testers info in your group
          2. create an array of developers store the developers info in your group
          3. create an object of ScrumTeam and store the testers &
                developers above to the scrum team
 */
    public class AppleInc {
    public static void main(String[] args) {


        Tester tester1 = new Tester("Sevda", 36, 'F', 97000, 543345, "SDET");
        Tester tester2 = new Tester("Kevser", 33, 'F', 117000, 954366, "SDET");
        Tester tester3 = new Tester("Nurbiye", 30, 'F', 127000, 987656, "SDET");

        Tester[] testers = {tester1, tester2, tester3};

        Developer developer1 = new Developer("Hatice", 32, 'F', 197000, 443245, "Developer");
        Developer developer2 = new Developer("Neslihan", 33, 'F', 157000, 654336, "Developer");
        Developer developer3 = new Developer("Jika", 36, 'F', 187000, 877656, "Developer");
        Developer developer4 = new Developer("Anam", 26, 'F', 197000, 765656, "Developer");

        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam(testers, developers);
        System.out.println(scrum1);

        Tester[] testers2 ={
                new Tester("Sev", 36, 'F', 111000, 553345, "SDET"),
                new Tester("Kev", 33, 'F', 132000, 45366, "SDET")
        };
        Developer[] developers2 = {
        new Developer("Hati", 32, 'F', 197000, 443245, "Developer"),
        new Developer("Nesli", 33, 'F', 157000, 654336, "Developer"),
        new Developer("Jik", 36, 'F', 187000, 877656, "Developer")
        };

        ScrumTeam scrum2 = new ScrumTeam(testers2, developers2);

        ScrumTeam[] allScrumTeam = {scrum1,scrum2};

        System.out.println("Testers: ");

        for (ScrumTeam eachScrum : allScrumTeam){
            for (Tester eachTester : eachScrum.testers){
                System.out.println(eachTester.name+ " "+ eachTester.salary);
            }
        }
        System.out.println();
        System.out.println("Developers: ");

        for (ScrumTeam eachScrum : allScrumTeam){
            for (Developer eachDeveloper : eachScrum.developers){
                System.out.println(eachDeveloper.name+ " "+ eachDeveloper.salary);
            }
        }





    }
}