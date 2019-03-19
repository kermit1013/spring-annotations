package com.spring.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private  String[] data = {
            "return msg 1",
            "return msg 2",
            "return msg 3"
    };

    private Random random = new Random();


    @Override
    public String getFortune() {
        // pick a random string from array
        int index = random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
