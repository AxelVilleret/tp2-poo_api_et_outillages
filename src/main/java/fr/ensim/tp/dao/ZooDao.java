package fr.ensim.tp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import fr.ensim.tp.enums.TypeAnimal;
import fr.ensim.tp.exception.AnimalDansMauvaisSecteurException;
import fr.ensim.tp.models.Animal;
import fr.ensim.tp.models.Secteur;

@Component
public class ZooDao implements IZooDao {

	public int visiteurs;
	public List<Secteur> secteursAnimaux = new ArrayList<Secteur>(); 
	public static int NB_VISITEYR_MAX_PAR_SECTEUR = 15;
	
	
	public void ajouterSecteur(TypeAnimal typeAnimal) {
		Secteur secteur = new Secteur(typeAnimal);
		this.secteursAnimaux.add(secteur);
	}
	
	
	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		for(Secteur secteur : secteursAnimaux) {
			if(secteur.typeAnimalDansSecteur.equals(animal.getTypeAnimal())) {
				secteur.ajouterAnimal(animal);
			}
		}
	}
	
	public int nombreAnimaux() {
		
		int nombreAnimaux = 0;
		for(Secteur secteur : secteursAnimaux) {
			nombreAnimaux += secteur.getNombreAnimaux();
		}
		return nombreAnimaux;
	}
	
	
	public List<Secteur> getSecteursAnimaux() {
		return this.secteursAnimaux;
	}
	
	public Secteur getSecteurFromType(TypeAnimal typeAnimal) {		
		return secteursAnimaux.stream().filter(secteur -> secteur.obtenirType().equals(typeAnimal)).findFirst().orElse(null);
	}
	
	public int getNBVisiteur() {
		return this.visiteurs;
	}
	
	public void ajouterVisiteur() {
		this.visiteurs ++;
	}

}
