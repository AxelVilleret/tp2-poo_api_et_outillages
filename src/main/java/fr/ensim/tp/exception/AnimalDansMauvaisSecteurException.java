package fr.ensim.tp.exception;

public class AnimalDansMauvaisSecteurException extends Exception {

	public AnimalDansMauvaisSecteurException () {
		super("Animal est dans le mauvais sercteur");
	}
}
