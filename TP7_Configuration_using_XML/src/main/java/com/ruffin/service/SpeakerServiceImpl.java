package com.ruffin.service;


import java.util.List;

import com.ruffin.model.Speaker;
import com.ruffin.repository.HibernateSpeakerRepositoryImpl;
import com.ruffin.repository.IHibernateSpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {

	private IHibernateSpeakerRepository hibernateSpeakerRepository = new HibernateSpeakerRepositoryImpl();

	@Override
	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}
	
};

