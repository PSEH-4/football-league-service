package com.sapient.assement.football.footballleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sapient.assement.football")
//@EnableSwagger2
public class FootballLeagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballLeagueApplication.class, args);
	}

}
