package de.danilova.jspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "human")
    public Human human(Registry registry){
        Human human = new Human();
       human.setRegistry(registry);
        return human;
    }

    @Bean(name ="registry")
  public Registry registry(Referral referral){
      Registry registry = new Registry();
      registry.setReferral(referral);
      return registry;
  }
    @Bean(name ="referral")
  public Referral referral(Schedule schedule, BuildingPlan buildingPlan){
       Referral referral = new Referral_Optometrist();
       ((Referral_Optometrist) referral).setDoctorsSchedule(schedule);
       ((Referral_Optometrist) referral).setOfficeNumber(buildingPlan);
        return referral;

  }
    @Bean(name ="schedule")
  public Schedule schedule(){
      return new Schedule();
  }
    @Bean(name ="buildingPlan")
  public BuildingPlan buildingPlan(){
      return new BuildingPlan();
  }
}
