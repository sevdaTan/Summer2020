package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {


        /*
         1. create 7 objects Offer Class and store them into an arraylist
         2. write a program that can only keep the offers from local area
         3. write program that can remove all the offers that are not SDET or QA
         4. write a program that can remove all the offers that are not WFH
         5. write a program that can remove all the offers that do not have benefits
         */
        public static void main(String[] args) {
            Offer offer1 = new Offer();
            offer1.setJobInfo("New York", false, 128000, true, "SDET");
            Offer offer2 = new Offer();
            offer2.setJobInfo("New Jersey", true, 130000, false, "QA");
            Offer offer3 = new Offer();
            offer3.setJobInfo("Carmel", false, 95000, false,"Testing Engineer");
            Offer offer4 = new Offer();
            offer4.setJobInfo("Fishers", true, 110000, true, "QA");
            Offer offer5 = new Offer();
            offer5.setJobInfo("Washington", true, 100000, true, "SDET");
            Offer offer6 = new Offer();
            offer6.setJobInfo("Dallas", true, 115000, true, "Front-end Engineer");
            Offer offer7 = new Offer();
            offer7.setJobInfo("Philadelphia", true, 125000, false, "QA");
            ArrayList<Offer> list = new ArrayList<>();
            list.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));
            //list.removeIf(each -> !each.location.equals("Atlanta"));
            list.removeIf(each -> !each.jobTitle.equals("QA") && !each.jobTitle.equals ("SDET"));
            //list.removeIf(each -> !each.hasBenefit);
            list.removeIf(each -> !each.WFH);
            for( Offer each : list ){
                each.getJobInfo();
            }
        }

 }
