package fr.ensim.tp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import fr.ensim.tp.dao.IZooDao;
import fr.ensim.tp.enums.TypeAnimal;
import fr.ensim.tp.exception.AnimalDansMauvaisSecteurException;
import fr.ensim.tp.models.Animal;
import fr.ensim.tp.models.Secteur;


@Service
public class ZooService implements IZooService {

	static Logger logger = Logger.getLogger(ZooService.class);
	
	IZooDao zooDao;
	
	public ZooService(IZooDao zooDao) {
		this.zooDao = zooDao;
	}
	

	public List<Secteur> getSecteursAnimaux() {
		return zooDao.getSecteursAnimaux();
	}
	
	/**
	 * @param TypeAnimal typeAnimal
	 * @return void
	 */
	public void ajouterSecteur(TypeAnimal typeAnimal) {
		logger.info("Entrer dans la méthode ajouterSecteur ");
		this.zooDao.ajouterSecteur(typeAnimal);
		logger.info("Sortie de la méthode ajouterSecteur ");
	}
	
	/**
	 * @param Animal animal
	 * @throws AnimalDansMauvaisSecteurException
	 */
	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		this.zooDao.nouvelAnimal(animal);
	}
	
	/**
	 * @param TypeAnimal
	 * @return Secteur
	 */
	public Secteur getSecteurFromType(TypeAnimal typeAnimal) {		
		return zooDao.getSecteurFromType(typeAnimal);
	}
	
	
	public int getNBVisiteur() {
		return zooDao.getNBVisiteur();
	}
	
	public void ajouterVisiteur() {
		zooDao.ajouterVisiteur();
	}
	
}
