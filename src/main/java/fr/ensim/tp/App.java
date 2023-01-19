package fr.ensim.tp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.ensim.tp.enums.TypeAnimal;
import fr.ensim.tp.models.Chat;
import fr.ensim.tp.models.Chien;
import fr.ensim.tp.service.ZooService;

public class App {

	public static void main(String[] args) {
		
		try {
			
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
			ZooService  monZoo = context.getBean(ZooService.class);
			
			//ZooService monZoo = new ZooService();
			
			monZoo.ajouterSecteur(TypeAnimal.CHAT);
			monZoo.ajouterSecteur(TypeAnimal.CHIEN);
		
			monZoo.nouvelAnimal(new Chien("snopy"));
			monZoo.nouvelAnimal(new Chat("caty"));
			
			
			monZoo.getSecteurFromType(TypeAnimal.CHAT).getAnimauxDansSecteur().stream().forEach(animal -> System.out.println(animal.nomAnimal));
			monZoo.getSecteurFromType(TypeAnimal.CHIEN).getAnimauxDansSecteur().stream().forEach(animal -> System.out.println(animal.nomAnimal));
			
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
