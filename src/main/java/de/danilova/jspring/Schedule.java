package de.danilova.jspring;

import org.springframework.stereotype.Component;

@Component("schedule")
public class Schedule {

    public void getDoctorsSchedule(){
        System.out.println("Monday 8:00-12:00");
    }
}

