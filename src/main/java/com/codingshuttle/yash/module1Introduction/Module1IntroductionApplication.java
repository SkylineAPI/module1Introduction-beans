package com.codingshuttle.yash.module1Introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);

		PayementService payementServiceobj = new PayementService();
		payementServiceobj.pay();
	}

}
