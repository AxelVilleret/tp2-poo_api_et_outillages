package fr.ensim.tp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensim.tp.service.IZooService;

@RestController
public class ZooController {

	@Autowired
	IZooService zooService;
	
	@GetMapping(path="/visiteur" , produces = "application/json")
	public int getNBVisiteur() {
		
		return zooService.getNBVisiteur();
		
	}
}
