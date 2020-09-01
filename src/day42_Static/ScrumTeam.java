package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    /*
    Attributes:
       PO, BA, SM,
       ArrayList<Tester> testers = new ArrayList<>(),
       ArrayList<Developer> developers = new ArrayList<>(),
   Actions:
    setInfo(): sets the names of: PO, BA, SM
    addTester(Tester tester): adds the given tester to the testers arraylist
    addTesters(Tester[] testers): adds the given testers to the testers arraylist
    addDeveloper(Developer developer): adds the given developer to the developers arraylist
    addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
    removeTester(long employeeID): removes the given tester from the testers arraylist
    removeDeveloper(long employeeID): removes the developer from the developers arraylist
     */

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }
    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void  addTesters(Tester[] testers){
        if (testers.length == 0){
            return;
        }
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(long employeeID){
        testers.removeIf(p -> p.employeeID == employeeID);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void  addDevelopers(Developer[] developers){
        if (developers.length == 0){ // to check if the array is empty
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(long employeeID){
        developers.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString(){
        return testers.size()+ " testers, "+ developers.size()+ " developers, PO: "+PO + ", BA: "+ BA + ", SM: "+SM;
    }
}
