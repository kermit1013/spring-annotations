package com.spring.annotations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        // call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //call our new swim coach methods .. has the props values injection
        System.out.println(theCoach.getEmail() +" "+ theCoach.getTeam());

        // close the context
        context.close();
    }
}
