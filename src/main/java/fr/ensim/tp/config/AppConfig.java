package fr.ensim.tp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"fr.ensim.tp.dao","fr.ensim.tp.service"})
public class AppConfig {

}
