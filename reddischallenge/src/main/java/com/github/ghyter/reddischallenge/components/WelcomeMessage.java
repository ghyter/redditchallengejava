package com.github.ghyter.reddischallenge.components;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage(){
        return "Welcome to my Spring Boot Application";
    }
}
