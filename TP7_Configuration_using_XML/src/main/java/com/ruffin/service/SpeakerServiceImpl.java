package com.ruffin.service;


import java.util.List;

import com.ruffin.model.Speaker;
import com.ruffin.repository.IHibernateSpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {

	private IHibernateSpeakerRepository hibernateSpeakerRepository;

	public SpeakerServiceImpl() {
		super();
	}

	public SpeakerServiceImpl(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		super();
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}

	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}

	
//	genere l'Exception :
//	Exception in thread "main" java.lang.NullPointerException
	public void setRepository(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}


};

