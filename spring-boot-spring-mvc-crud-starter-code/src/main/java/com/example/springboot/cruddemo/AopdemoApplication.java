package com.example.springboot.cruddemo;

import org.springframework.boot.CommandLineRunner; 
import org.springframework.context.annotation.Bean;
 
public class AopdemoApplication {

 	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO) {

		return runner -> {

			demoTheBeforeAdvice(theAccountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO) {

		// call the business method
		theAccountDAO.addAccount();

		// do it again!
		System.out.println("\n let's call it again!\n");

		// call the business method again
		theAccountDAO.addAccount();
	}

}








