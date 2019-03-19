package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.annotations")
public class SportConfig {

    //define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    //define bean for our swim coach AND injection dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
