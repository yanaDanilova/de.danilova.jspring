package de.danilova.jspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("referral")
public class Referral_Optometrist  implements Referral {
    private String doctorsSchedule;
    private Integer officeNumber;

    @Qualifier("schedule")
   public void setDoctorsSchedule(Schedule schedule){
        schedule.getDoctorsSchedule();
    }
    @Qualifier("buildingPlan")
    public void setOfficeNumber(BuildingPlan buildingPlan){
        buildingPlan.getDoctorsOfficeNumber();
    }
    @Override
    public void direct() {
        System.out.println("a referral to the Optometrist has been issued");
    }
}
