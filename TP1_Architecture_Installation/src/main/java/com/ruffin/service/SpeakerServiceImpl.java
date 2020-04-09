package com.ruffin.service;


import java.util.List;

import com.ruffin.model.Speaker;
import com.ruffin.repository.HibernateSpeakerRepositoryImpl;
import com.ruffin.repository.IHibernateSpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {

	// declaration, initialise une instance de l'interface
	private IHibernateSpeakerRepository hibernateSpeakerRepository = new HibernateSpeakerRepositoryImpl();

	// similaire a la methode findAll de l'implementation
	// Nous declarons, initilisons donc hibernateSpeakerRepository
	// pour avoir acces à findAll()
	@Override
	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}
	// Il faut ensuite créer l'interface du service SpeakerServiceImpl => ISpeakerService
	
};

