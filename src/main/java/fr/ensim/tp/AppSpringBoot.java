package fr.ensim.tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import fr.ensim.tp.service.IZooService;

@SpringBootApplication
public class AppSpringBoot {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(AppSpringBoot.class, args);
		
		IZooService zooService = context.getBean(IZooService.class);
		zooService.ajouterVisiteur();
	}
}
