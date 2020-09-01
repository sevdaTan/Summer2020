package day39_CustomClass;

public class Offer {
    // Attributes: Location, hasBenefit, salary, WFH, JobTitle
    // Actions: setInfo, getInfo
    String location;
    boolean hasBenefit;
    double salary;
    boolean WFH;
    String jobTitle;
    public void setJobInfo(String jobLocation, boolean benefit, double jobSalary, boolean isWFH, String title){
        location = jobLocation;
        hasBenefit = benefit;
        salary = jobSalary;
        WFH = isWFH;
        jobTitle = title;
    }
    public void getJobInfo(){
        System.out.println("Location: "+ location + "\n Has Benefit: " + hasBenefit + "\n Salary: " + salary + "\n Is WFH: "+ WFH);
    }

}
