package com.ruffin.service;


import java.util.List;

import com.ruffin.model.Speaker;
import com.ruffin.repository.IHibernateSpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {

	// declaration, initialise une instance de l'interface
	// ATTETION COMME VU precedemment dans les cours de java
	// new TUE le couplage fort
	// NEWW ===== VERY BAD  ==== HARD CODING
	// on retire à hibernateSpeakerRepository :  = new HibernateSpeakerRepositoryImpl();
	// on creer à la place un setter que l'on utilisera dans notre app a travers le fichier
	// de configuration
	private IHibernateSpeakerRepository hibernateSpeakerRepository;

	// similaire a la methode findAll de l'implementation
	// Nous declarons, initilisons donc hibernateSpeakerRepository
	// pour avoir acces à findAll()
	@Override
	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}
	// Il faut ensuite créer l'interface du service SpeakerServiceImpl => ISpeakerService

	public void setHibernateSpeakerRepository(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}
	
};

