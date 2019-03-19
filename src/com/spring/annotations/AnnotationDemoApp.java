package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/kermit/IdeaProjects/spring-annotations/web/WEB-INF/applicationContext.xml");
        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        // call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();

    }

}
