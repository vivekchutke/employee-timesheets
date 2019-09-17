package com.vivekchutke.microservice.employee.cfemployeetimesheetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing  //To enable JPA Auditing, you’ll need to add @EnableJpaAuditing annotation to one of your configuration classes
public class CFEmployeeTimesheetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CFEmployeeTimesheetServiceApplication.class, args);
	}

}
