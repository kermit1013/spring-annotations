package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
         //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/kermit/IdeaProjects/spring-annotations/web/WEB-INF/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        Coach AlphaCoach = context.getBean("tennisCoach",Coach.class);

        //check if they are the same
        boolean result = (theCoach == AlphaCoach);

        System.out.println(result);
        context.close();
    }
}
