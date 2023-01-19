package fr.ensim.tp.models;

import fr.ensim.tp.enums.TypeAnimal;

public class Chien extends Animal{
	
	public Chien(String nomAnimal) {
		super(nomAnimal,TypeAnimal.CHIEN);
	}
	
	@Override
	public String getNomAnimal() {
		return "Le nom du chien est :" + super.getNomAnimal();
	}
}
