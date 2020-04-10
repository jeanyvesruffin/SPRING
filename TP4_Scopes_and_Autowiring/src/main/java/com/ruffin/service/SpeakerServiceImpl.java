package com.ruffin.service;


import java.util.List;

import com.ruffin.model.Speaker;
import com.ruffin.repository.IHibernateSpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {

	private IHibernateSpeakerRepository hibernateSpeakerRepository;
	// ajout du construccteur prenant en parametre hibernateSpeakerRepository
	public SpeakerServiceImpl(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		super();
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}

	@Override
	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}
	
	public void setHibernateSpeakerRepository(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}
	
};

