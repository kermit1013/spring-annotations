package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private  FortuneService fortuneService;

    //define a default constructor
    public  TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }



    //define a setter method
//    @Autowired
//    public void doSomething(FortuneService theFortuneService){
//        System.out.println("TennisCoach: inside doSomething() method");
//        fortuneService = theFortuneService;
//    }


//  construct injection
//    @Autowired
//    public  TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    @Override
    public String getDailyFortune(){
        return  fortuneService.getFortune();
    }
    // define my init method
    //@PostConstruct
    public  void  doMyStartupStuff(){
        System.out.println("TennisCoach: inside of init method");
    }

    // define my destroy method
    //@PreDestory
    public  void  doMyCleanupStuff(){
        System.out.println("TennisCoach: inside of destroy method");
    }


}
