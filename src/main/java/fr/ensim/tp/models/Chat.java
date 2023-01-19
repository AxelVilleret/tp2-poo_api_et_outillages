package fr.ensim.tp.models;

import fr.ensim.tp.enums.TypeAnimal;

public class Chat extends Animal {

	public Chat(String nomAnimal) {
		super(nomAnimal, TypeAnimal.CHAT);
	}
	
	@Override
	public String getNomAnimal() {
		return "Le nom du chat est :" + super.getNomAnimal();
	}
	
}
