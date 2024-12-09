package com.github.ghyter.reddischallenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.ghyter.reddischallenge.components.WelcomeMessage;

@SpringBootApplication
public class ReddischallengeApplication {
	private static final Logger log = LoggerFactory.getLogger(ReddischallengeApplication.class);

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(ReddischallengeApplication.class, args);

		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
		log.info(welcomeMessage.getWelcomeMessage());
 
	}

}
