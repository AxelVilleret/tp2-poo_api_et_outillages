package fr.ensim.tp.dao;

import java.util.List;

import fr.ensim.tp.enums.TypeAnimal;
import fr.ensim.tp.exception.AnimalDansMauvaisSecteurException;
import fr.ensim.tp.models.Animal;
import fr.ensim.tp.models.Secteur;

public interface IZooDao {

	public void ajouterSecteur(TypeAnimal typeAnimal);

	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException;

	public int nombreAnimaux();

	public List<Secteur> getSecteursAnimaux();

	public Secteur getSecteurFromType(TypeAnimal typeAnimal);
	
	public int getNBVisiteur();
	
	public void ajouterVisiteur();
}