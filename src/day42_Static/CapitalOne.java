package day42_Static;

public class CapitalOne {
    /*
     create a class called MyScrumTeam:
       1. create an array of Testers and store the
          testers info in your group
       2. create an array of developers store the developers
            info in your group
       3. create an object of ScrumTeam and store the testers &
           developers above to the scrum team
    Answer the interview question "Tell me about your scrum team"
     */

    public static void main(String[] args) {

        Tester[] testers = {new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Sevda",'F',45332,"SDET",125000);
        testers[1].setInfo("Jika",'F',21442,"SDET",135000);
        testers[2].setInfo("Busra",'F',87552,"SDET",130000);

        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Roman", 'M',83212,"Dev",145000);
        developers[1].setInfo("Illia", 'M',74532,"Dev",140000);
        developers[2].setInfo("Hatice", 'F',43654,"Dev",135000);
        developers[3].setInfo("Ali", 'M',43786,"Dev",150000);
        developers[4].setInfo("Andrey", 'M',93987,"Dev",130000);

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ryan", "Virginia", "Ernis");
        team1.addTesters(testers);
        team1.addDevelopers(developers);

        System.out.println(team1);

        System.out.println("===== Testers ======");

        for (Tester each : team1.testers){
            System.out.println(each.name+ " : $" + each.salary);
        }

        System.out.println("====== Developers =====");
        for (Developer each : team1.developers){
            System.out.println(each.name+ " : $" + each.salary);
        }
        System.out.println("===== Remove ====");

        team1.removeTester(87552);
        team1.removeDeveloper(74532);

        System.out.println(team1);

        System.out.println("======= Add =====");

        Developer dev1 = new Developer();
        dev1.setInfo("Neslihan",'F',98767,"Dev",137000);
        team1.addDeveloper(dev1);
        System.out.println(team1);

        System.out.println("===== Max Salary / Min Salary =====");

        double maxTestSalary = Integer.MIN_VALUE;
        for (Tester each: testers){
            if (each.salary > maxTestSalary){
                maxTestSalary = each.salary;
            }
        }
        System.out.println(maxTestSalary);


        double maxDevSalary = Double.MIN_VALUE;
        for (Developer each: developers){
            if (each.salary > maxDevSalary){
                maxDevSalary = each.salary;
            }
        }
        System.out.println( maxDevSalary);

    }


}
