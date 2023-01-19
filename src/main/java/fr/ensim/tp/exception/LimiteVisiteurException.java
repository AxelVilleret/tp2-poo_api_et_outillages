package fr.ensim.tp.exception;

public class LimiteVisiteurException extends Exception{

	public LimiteVisiteurException() {
		super("Le nombre maximum de visiteurs atteint");
	}
}
