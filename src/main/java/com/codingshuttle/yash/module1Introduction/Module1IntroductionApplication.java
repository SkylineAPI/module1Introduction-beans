package com.codingshuttle.yash.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	@Autowired
	PayementService payementServiceObj;

	@Autowired
	PayementService payementServiceObj1;

	@Autowired
	PayementService payementServiceObj2;

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		payementServiceObj.pay();
		payementServiceObj1.pay();
		payementServiceObj2.pay();
		System.out.println(payementServiceObj1.hashCode());
		System.out.println(payementServiceObj2.hashCode());
	}


}
