package fr.ensim.tp.service;

import java.util.List;

import fr.ensim.tp.enums.TypeAnimal;
import fr.ensim.tp.exception.AnimalDansMauvaisSecteurException;
import fr.ensim.tp.models.Animal;
import fr.ensim.tp.models.Secteur;

public interface IZooService {

	
	public List<Secteur> getSecteursAnimaux();
	
	public void ajouterSecteur(TypeAnimal typeAnimal);
	
	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException;
	
	public Secteur getSecteurFromType(TypeAnimal typeAnimal);
	
	public int getNBVisiteur();
	
	public void ajouterVisiteur();
}
